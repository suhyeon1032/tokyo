package ch3;

import java.util.List;
import java.util.Scanner;

public class ProductController {

	Scanner sc = new Scanner(System.in);
	private ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	public void run() {

		while (true) {
			System.out.println("1 - 상품 등록 | 2 - 전체 상품 조회 | 3 - 개별 상품 조회"
					+ " | 4 - 상품 정보 삭제 | 5 - 상품 정보 수정 | 6 - 상품 분석 | 0 - 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 1: addProduct(); break;
			case 2: outAllProduct(); break;
			case 3: selectProduct(); break;
			case 4: deleteProduct(); break;
			case 5: updateProduct(); break;
			case 6: outProdouct(); break;
			case 0: System.out.println("프로그램 종료!"); return;
				
			default:
				System.out.println("숫자만 입력하세요.");
			}
		}

	}

	private void updateProduct() {
		List<ProductDTO> product = service.getAllProduct();
		
		if (product.isEmpty()) {
			System.out.println("저장된 상품이 없습니다.");
		} else {
			System.out.println("수정할 상품의 번호를 입력하세요");
			int id = sc.nextInt();
			sc.nextLine();
			
			ProductDTO dto = service.findProduct(id);
			
			if (dto == null) System.out.println("입력한 번호의 상품이 존재하지 않습니다.");
			else {
				System.out.println("상품명 입력 (" + dto.getName() + "): ");
				String NewName = sc.nextLine();
				System.out.println("수량 입력 (" + dto.getQty() + "): ");
				int NewQty = sc.nextInt();
				System.out.println("가격 입력 (" + dto.getPrice() + "): ");
				int NewPrice = sc.nextInt();
				
				if (service.updateProductById(id, NewName, NewQty, NewPrice)) { // true false 반환 받음
					System.out.println("정보가 수정되었습니다.");
				} else {
					System.out.println("수정 실패!");
				}
			}
		}
	}

	private void selectProduct() { // 개별 상품 조회
		
		List<ProductDTO> product = service.getAllProduct();
		
		if (product.isEmpty()) {
			System.out.println("저장된 상품이 없습니다.");
		} else {
			System.out.println("개별 상품 조회할 번호를 입력하세요.");
			int n = sc.nextInt();
			sc.nextLine();
			
			if (service.findProduct(n) == null) System.out.println("입력한 번호의 상품이 존재하지 않습니다.");
			else System.out.println(service.findProduct(n));
		}
	}

	private void deleteProduct() {
		System.out.println("삭제할 상품의 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (service.deleteRowProduct(n)) System.out.println("삭제 완료");
		else System.out.println("해당 번호의 상품은 존재하지 않습니다.");
		
		service.deleteRowProduct(n);
	}

	private void outProdouct() { // 상품 분석 (상품 갯수, 전체 상품 합계)
		List<ProductDTO> product = service.getAllProduct();
		
		if (product.isEmpty()) {
			System.out.println("저장된 리스트가 없습니다.");
		} else {
			int cnt = service.getProductCnt(); // 전체 상품 갯수
			int sum = service.getProductTotal(); // 전체 상품 합계
			
			System.out.printf("전체 상품 갯수: %,d개 | 합계 : %,d 원\n", cnt, sum);
		}
	}

	// 전체 상품 출력
	private void outAllProduct() {
		List<ProductDTO> product = service.getAllProduct();
		
		if (product.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
		} else {
			for (ProductDTO dto : product) {
				System.out.print(dto);
			}
		}		
	}

	private void addProduct() { // 상품 등록(추가)
		System.out.println("상품명 입력: ");
		String name = sc.nextLine();
		System.out.println("수량 입력: ");
		int qty = sc.nextInt();
		System.out.println("가격 입력: ");
		int price = sc.nextInt();	
		
		service.saveAllProduct(name, qty, price);
		
		System.out.println("등록 완료!");
	}
	

}
