package ch1;

public class Bread {
	
	// 속성 == 필드
	private String name;
	private int gram;
	private int price;
	private int cnt;
	
	public Bread() {
		// super(); // 기본 생성자가 필요해서 만들어둠 // 다른 클래스가 상속받는 부모(상위) 클래스. 공통 속성, 동작을 수퍼클래스에 정의
	}

	public Bread(String name, int gram, int price, int cnt) {
		this.name = name;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	// 금액 = 가격 * 갯수
	public int breadTotal() { // 매개변수가 없을 떄
		return this.price * this.cnt;
	}
	
	public int breadTotTal(int price) { // 매개변수에 가격만
		return price * this.cnt;
	}
	public int breadTotTal(int price, int cnt) { // 매개변수에 가격, 갯수
		return price * cnt;
	}

	@Override
	public String toString() {
		return "Bread [제품명=" + name + ", 수량=" + gram + ", 금액=" + price + ", 수량=" + cnt + ", breadTotal()="
				+ breadTotal() + "]";
	}
	
	

//	@Override
//	public String toString() { // 출력값은 오버라이드해서 미리 작성
//		return "Bread [제품명=" + name + ", 중량=" + gram + ", 가격=" + price + ", 수량=" + cnt + "]";
//	}
	
	
}
