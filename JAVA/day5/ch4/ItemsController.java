package ch4;

import java.util.List;
import java.util.Scanner;

import ch3.ProductDTO;

public class ItemsController {
	
	Scanner sc = new Scanner(System.in);
	private ItemsService service;
	
	public ItemsController(ItemsService service) {
		this.service = service;
	}

	public void run() {

		while (true) {
			System.out.println("| 1 - 아이템 등록 | 2 - 전체 조회 | 3 - 개별 조회 | \n| 4 - 아이템 삭제 | 5 - 아이템 수정 | 6 - 통계 | 0 - 종료 |");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1: addItems(); break; // 아이템 추가
			case 2: selectAllItems(); break; // 아이템 전체 조회
			case 3: selectItemsById(); break; // 아이템 개별 조회
			case 4: delectItems(); break; // 아이템 삭제
			case 5: updateItems(); break; // 아이템 수정(아이템명, 수량, 가격)
			case 6: outItems(); break; // 통계
			case 0: System.out.println("프로그램을 종료합니다!"); return; // 종료
			default:
				System.out.println("숫자를 입력하셔요");
			}
		}
	}

	// 통계
	private void outItems() {
		List<ItemsDTO> item = service.getAllItems();
		
		if (item.isEmpty()) {
			System.out.println("저장된 아이템이 없습니다.");
		} else {
			int cnt = service.getItemsCnt();
			int total = service.getItemsTotal();
			
			System.out.printf("전체 상품 갯수: %,d개 | 합계 : %,d 원\n", cnt, total);
		}
	}

	private void updateItems() {
		List<ItemsDTO> item = service.getAllItems();
		
		if (item.isEmpty()) {
			System.out.println("저장된 아이템이 없습니다.");
		} else {
			System.out.println("수정할 아이템의 번호를 입력하세요: ");
			int index = sc.nextInt();
			sc.nextLine();
			
			ItemsDTO dto = service.findItemById(index);
			
			if (dto == null) System.out.println("입력한 번호의 아이템이 존재하지 않습니다.");
			else {
				System.out.println("상품명 입력 (" + dto.getName() + "): ");
				String NewName = sc.nextLine();
				System.out.println("수량 입력 (" + dto.getQty() + "): ");
				int NewQty = sc.nextInt();
				System.out.println("가격 입력 (" + dto.getPrice() + "): ");
				int NewPrice = sc.nextInt();
				
				if (service.updateItemById(index, NewName, NewQty, NewPrice)) { // true false 반환 받음
					System.out.println("정보가 수정되었습니다.");
				} else {
					System.out.println("수정 실패!");
				}
			}
		}
	}

	// 아이템 삭제
	private void delectItems() {
		System.out.println("삭제할 상품의 번호를 입력하세요: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (service.deleteItemById(index)) System.out.println("삭제 완료");
		else System.out.println("해당 번호의 상품은 존재하지 않습니다.");
		
		service.deleteItemById(index);
	}

	// 개별 상품 조회
	private void selectItemsById() {
		List<ItemsDTO> item = service.getAllItems();
		
		if (item.isEmpty()) {
			System.out.println("저장된 상품이 없습니다.");
		} else {
			System.out.println("조회할 아이템 번호를 입력하세요: ");
			int index = sc.nextInt();
			sc.nextLine();
			
			if (service.findItemById(index) == null) System.out.println("입력한 번호의 아이템이 존재하지 않습니다.");
			else System.out.println(service.findItemById(index));
		}
	}

	// 전체 상품 조회
	private void selectAllItems() {
		List<ItemsDTO> item = service.getAllItems();
		
		if (item.isEmpty()) System.out.println("등록된 아이템이 없습니다.");
		else {
			for (ItemsDTO dto : item) {
				System.out.println(dto);
			}
		}
		System.out.println();
	}

	// 아이템 추가
	private void addItems() {
		System.out.println("아이템명 입력: ");
		String name = sc.nextLine();
		System.out.println("수량 입력: ");
		int qty = sc.nextInt();
		System.out.println("가격 입력: ");
		int price = sc.nextInt();
		
		service.saveAllItems(name, qty, price);
		
		System.out.println("등록 완료!");
		
	}

	
}
