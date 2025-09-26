package ch4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ItemsDAO {
	
	private String filename;
	private List<ItemsDTO> itemsList;
	// ItemsDTO 데이터 저장소
//		private List<ItemsDTO> itemsList = new ArrayList<ItemsDTO>();
	
	// 생성자에서 파일을 받아 리스트 초기화
	public ItemsDAO(String filename) {
		this.filename = filename;
		this.itemsList = loadCsv(filename);
	}

	
	// csv 파일에서 목록 읽기
	private List<ItemsDTO> loadCsv(String filename2) {
		
		List<ItemsDTO> list = new ArrayList<>(); //<ItemsDTO> 17버전에선 안에 내용 지워도 됨
		
		/*
		 * BufferedReader br = new BufferedReader(); 문서에서 한 줄식 읽게 함
		 * new FileReader(filename) 파일을 읽을 때 사용. 문자데이터를 한글자씩 읽음
		 * 
		 * 예외처리 : 프로그램 실행 중에 오류가 발생하여도 계속 사용할 수 있게 하는 것
		 * 1. try-catch(-finally)
		 * 2. throws
		 * */
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line; // 파일에서 읽어온 한 줄 데이터 저장 할 변수
			boolean skip = true; //
			
			while ( (line = br.readLine()) != null) { // 불러온 파일을 한 줄씩 읽음. null이면 종료
				
				if(skip) { // 파일의 처음에 머릿말이 있는 경우
					skip = false;
					continue; 
				}
				
				String[] part = line.split(","); // .split()
				int id = Integer.parseInt(part[0].trim()); // 앞 뒤로 공백 제거
				String name = part[1].trim();
				int qty = Integer.parseInt(part[2].trim());
				int price = Integer.parseInt(part[3].trim());
				
				// 새로운 ItemDTO 객체를 만들고 리스트에 추가
				list.add(new ItemsDTO(id, name, qty, price));
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("csv nai : " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) { // 기타오류
			System.out.println("기타오류 : " + e.getMessage());
		}
		
		return list;
	}

	public void save(ItemsDTO dto) {
		itemsList.add(dto);
		writeCsv();
	}

	// csv 파일에 저장
	private void writeCsv() {
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			
			pw.println("id,name,qty,price"); // 머릿말 수동입력
			
			for(ItemsDTO dto : itemsList) {
				pw.printf("%d,%s,%d,%d\n", dto.getId(),dto.getName(),dto.getQty(),dto.getPrice());
			}
		} catch (Exception e) {
			System.out.println("csv 저장 실패: " + e.getMessage());
		} 
	}

	public List<ItemsDTO> findAll() {
		return itemsList;
	}

	public ItemsDTO findById(int index) {
		for (int i = 0; i < itemsList.size(); i++) {
			if (itemsList.get(i).getId() == index) {
				return itemsList.get(i);
			}
		}
		return null;
	}

	public boolean delectById(int index) {
		for (int i = 0; i < itemsList.size(); i++) {
			if (itemsList.get(i).getId() == index) {
				itemsList.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean updateById(int index, String newName, int newQty, int newPrice) {
		ItemsDTO dto = findById(index);
		if (dto != null) {
			dto.setName(newName);
			dto.setQty(newQty);
			dto.setPrice(newPrice);
			return true;
		} else return false;
	}
	

}
