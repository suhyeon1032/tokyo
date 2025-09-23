package ch3;
/*
 * 상품 관리 프로그램
 * 1. 상품 등록: 상품명, 수량, 가격, 상품번호(자동증가)
 * 2. 전체 상품 조회: 상품 번호, 상품 명, 수량, 가격, 합계(출력)
 * 3. 개별 상품 조회: 원하는 번호 입력 시 해당 상품만 출력
 * 4. 상품 정보 삭제: 원하는 번호 입력 시 해당 상품만 삭제
 * 5. 상품 정보 수정: 원하는 번호 입력 시 해당 상품만 수정(상품번호는 수정x)
 * 6. 상품 분석: 상품의 갯수, 전체 상품의 합계
 * 0. 프로그램 종료
 * 1,2,0,6
 * */
public class ProductDTO {
	private int id; // 상품 번호
	private String name; // 상품명
	private int qty; // 수량
	private int price; // 가격
	private int total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		setTotal();
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.qty * this.price;
	}
	
	public ProductDTO(String name, int qty, int price) {
//		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	private String formatMoney(int money) {
		return String.format("%,d원", money);
	}
	
	@Override
	public String toString() {
		//return "제품 번호: " + id + " 제품명: " + name + " 수량: " + qty + " 가격: " + price;
		return String.format("번호: %d, 이름:%s, 수량:%d, 가격:%s, 합계:%s\n", id, name, qty, formatMoney(price), formatMoney(total));
	}
	
	
}
