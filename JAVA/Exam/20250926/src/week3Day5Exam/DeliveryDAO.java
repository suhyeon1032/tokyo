package week3Day5Exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO {

	private String filename;
	private List<DeliveryDTO> deliveryList;

	public DeliveryDAO(String filename) {
		this.filename = filename;
		this.deliveryList = loadCsv(filename);
	}

	private List<DeliveryDTO> loadCsv(String filename2) {
		List<DeliveryDTO> list = new ArrayList<DeliveryDTO>();

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			boolean skip = true;
			
			while ((line = br.readLine()) != null) { // 파일을 한 줄씩 불러오기 null일 경우 종료
				if (skip) {
					skip = false;
					continue;
				}
			
				String[] part = line.split(","); // 문장을 ","으로 나눈다
				int id = Integer.parseInt(part[0].trim()); // .trim() 앞 뒤 공백 제거
				String name = part[1].trim();
				int qty = Integer.parseInt(part[2].trim());
				int price = Integer.parseInt(part[3].trim());
				int stock = Integer.parseInt(part[4].trim());
				
				// 새 DeliveryDTO 객체 생성, 리스트에 추가
				list.add(new DeliveryDTO(id, name, price, qty, stock));
			}

		} catch (FileNotFoundException e) {
			System.out.println("csv xxxxx: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 오류: " + e.getMessage());
		}
		return list;
	}

	public List<DeliveryDTO> findAll() {
		return deliveryList;
	}

	public void save(DeliveryDTO dto) {
		deliveryList.add(dto);
		writeCsv();
	}

	// 입력된 값 csv 파일에 저장
	public void writeCsv() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			pw.println("id,name,price,qty,stock");

			for (DeliveryDTO dto : deliveryList) {
				pw.printf("%d,%s,%s,%s,%s\n", dto.getId(), dto.getName(), dto.getPrice(), dto.getQty(), dto.getStock());
			}
		} catch (Exception e) {
			System.out.println("csv 저장 실패: " + e.getMessage());
		}
	}

	// 입력된 번호의 제품 찾기
	public DeliveryDTO findById(int index) {
		for (int i = 0; i < deliveryList.size(); i++) {
			if (deliveryList.get(i).getId() == index) {
				return deliveryList.get(i);
			}
		}
		return null;
	}

	// 개별 제품 삭제
	public boolean deleteById(DeliveryDTO dto) {
		return deliveryList.remove(dto);
	}

	public boolean updateById(DeliveryDTO order, String newName, int newPrice, int newQty, int newStock) {
		if (order == null) return false;
		else {
			order.setName(newName);
			order.setPrice(newPrice);
			order.setQty(newQty);
			order.setStock(newStock);
			
			return true;
		}
	}
}
