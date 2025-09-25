package ch4;

/*
 * 요구사항
 * -. 아이템번호(자동 증가), 아이템명, 수량, 가격, 합계
 * 1. 아이템 입력(외부 문서)
 * 2. 아이템 전체 조회
 * 3. 아이템 개별 조회
 * 4. 아이템 삭제
 * 5. 아이템 수정: 아이템 명, 수량, 가격
 * 6. 통계
 * 0. 프로그램 종료
 * 
 * */
public class ItemsDTO {
	private int id;
	private String name;
	private int qty;
	private int price;
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
	public ItemsDTO(int id, String name, int qty, int price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "제품 번호: " + id + ", 이름: " + name + ", 수량: " + qty + ", 가격: " + price + ", 총합: " + total;
	}
	
	
}
