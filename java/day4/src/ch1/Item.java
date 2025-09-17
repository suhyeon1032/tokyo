package ch1;

public class Item {
	// 상품의 이름, 가격, 수량 출력
	private String name;
	private int price;
	private int cnt;
	
	// getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCnt() {
		return cnt;
	}
	
	// cnt 값을 1로 초기값 설정 생성자
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
		this.cnt = 1;
	}
	
	public Item(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
	public int total() {
		return price * cnt;
	}
	
	@Override
	public String toString() {
		return "이름=" + name + ", 가격=" + price + ", 수량=" + cnt + "합계 : " + total();
	}
	
	
	
	
	
	
	
	
}
