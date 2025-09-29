package week3Day5Exam;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeliveryController {
	
	Scanner sc = new Scanner(System.in);
	private DeliveryService service;
	
	public DeliveryController(DeliveryService service) {
		super();
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1 - 제품 등록 | 2 - 전체조회 | 3 - 개별조회 | 4 - 삭제 | 5 - 수정 | 6 - 통계 | 0 - 종료");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1: addOrder(); break;
			case 2: selectAllDelivery(); break;
			case 3: selecDeliverytById(); break;
			case 4: deleteDeliveryById(); break;
			case 5: updateDeliveryById(); break;
			case 6: outDelivery(); break;
			case 0: System.out.println("프로그램 종료!"); return;

			default:
				System.out.println("숫자를 입력하세요.");
			}
		}
	}

	// 통계
	private void outDelivery() {
		List<DeliveryDTO> dto = service.getAllDelivery();
		
		if (service.emptyList()) System.out.println("등록된 제품이 없습니다.");
		else {
			int total = service.getDeliveryTotal();
//			int qtyCnt = service.getDeliveryqtyCnt();
			int stockCnt = service.getDeliverystockCnt();
			
			DecimalFormat df = new DecimalFormat("#,###");
			System.out.printf("제품 총 가격: %s원 | 총 수량: %s개\n", df.format(total), df.format(stockCnt));
		}
	}

	private void updateDeliveryById() {
		if (service.emptyList()) System.out.println("등록된 제품이 없습니다.");
		else {
			System.out.println("수정할 제품 번호 입력:");
			int q = sc.nextInt();
			sc.nextLine();
			
			DeliveryDTO order = service.findDeliveryById(q);
			if (order == null) System.out.println("등록된 제품이 없습니다.");
			else {
				System.out.println("수정할 제품 명 (" + order.getName() + "): ");
				String newName = sc.nextLine();
				System.out.println("수정할 가격 (" + order.getPrice() + "): ");
				int newPrice = sc.nextInt();
				System.out.println("수정할 수량 (" + order.getQty() + "): ");
				int newQty = sc.nextInt();
				System.out.println("수정할 현재 재고 (" + order.getStock() + "): ");
				int newStock = sc.nextInt();
				
				
				
				if (service.updateDeliveryById(order, newName, newPrice, newQty, newStock)) {
					System.out.println("업데이트 완료되었습니다.");
					System.out.println("제품명: " + newName + " 가격: " + newPrice + " 수량: " + newQty + " 재고: " + newStock);
				} else System.out.println("제품 업데이트 실패");

			}
		}
	}

	private void deleteDeliveryById() {
		
		if (service.emptyList()) System.out.println("등록된 제품이 없습니다.");
		else {
			System.out.println("삭제할 번호 입력: ");
			int index = sc.nextInt();
			sc.nextLine();
			
			if (service.delDeliveryById(index)) System.out.println("삭제 완료되었습니다.");
			else System.out.println("해당 번호의 제품은 존재하지 않습니다.");
		}
	}

	private void selecDeliverytById() {
		
		if (service.emptyList()) System.out.println("등록된 제품이 없습니다.");
		else {
			System.out.println("조회할 번호 입력: ");
			int index = sc.nextInt();
			sc.nextLine();
			
			if (service.findDeliveryById(index) == null) System.out.println("입력하신 번호의 제품이 없습니다.");
			else System.out.println(service.findDeliveryById(index));
		}
	}

	private void selectAllDelivery() {
		List<DeliveryDTO> list = service.getAllDelivery();
		
		if (service.emptyList()) System.out.println("등록된 제품이 없습니다.");
		else {
			for (DeliveryDTO dto : list) {
				System.out.println(dto);
			}
		}
	}

	private void addOrder() {
		System.out.println("품명 입력: ");
		String name = sc.nextLine();
		System.out.println("가격 입력: ");
		int price = sc.nextInt();
		System.out.println("주문 가능 수 입력: ");
		int qty = sc.nextInt();
		System.out.println("현재재고 입력: ");
		int stock = sc.nextInt();
		
		service.saveAllOrder(name, price, qty, stock);
		
		System.out.println("등록 완료!");
		
	}

	
}
