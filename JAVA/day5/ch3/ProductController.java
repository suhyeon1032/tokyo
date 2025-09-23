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
			System.out.println("번호 입력: 1 - 상품 등록 | 2 - 전체 상품 조회 | 3 - 개별 상품 조회"
					+ " | 4 - 상품 정보 삭제 | 5 - 상품 정보 수정 | 6 - 상품 분석 | 0 - 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 1: addProduct(); break;
			case 2: outAllProduct(); break;
			case 3: {
//				System.out.println("개별 상품 조회할 번호를 입력하세요.");
//				int n = sc.nextInt();
//				
//				System.out.println(service.findProduct(n));
				break;
			}
//			case 4: deleteProduct(); break;
//			case 5: updateProduct(); break;
			case 6: outProdouct(); break;
			case 0: System.out.println("프로그램 종료"); return;
				
			default:
				System.out.println("숫자만 입력하세요.");
			}
		}

	}

//	private void updateProduct() {
//		List<ProductDTO> product = service.getAllProduct();
//		
//		if (product.isEmpty()) {
//			System.out.println("저장된 리스트가 없습니다.");
//		} else {
//			
//		}
//	}

	private void outProdouct() { // 상품 갯수, 전체 상품 합계
		List<ProductDTO> product = service.getAllProduct();
		
		if (product.isEmpty()) {
			System.out.println("저장된 리스트가 없습니다.");
		} else {
			int cnt = service.getProductCnt(); // 전체 상품 갯수
			int sum = service.getProductTotal(); // 전체 상품 합계
			
			System.out.println("전체 상품 갯수: " + cnt + " 전체 상품 합계: " + sum);
		}
	}

	private void outAllProduct() {
		List<ProductDTO> product = service.getAllProduct();
		
		if (product.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for (ProductDTO dto : product) {
				System.out.print(dto);
			}
		}		
	}

	private void addProduct() {
		System.out.println("상품명 입력: ");
		String name = sc.nextLine();
		System.out.println("수량 입력: ");
		int qty = sc.nextInt();
		System.out.println("가격 입력: ");
		int price = sc.nextInt();	
		service.addProduct(name, qty, price);
	}

}
