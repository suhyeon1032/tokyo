package week3Day5Exam;

import java.text.DecimalFormat;

/*
 * 배달 주문 리스트 프로그램
 * id(자동증가번호), name(품명), price(가격), qty(주문가능 수), stock
 * 1. 품명 입력
 * 2. 전체 조회
 * 3. 개별 조회
 * 4. 삭제
 * 5. 수정
 * 6. 통계
 * */
public class DeliveryDTO {
	
	private int id;
	private String name;
	private int price;
	private int qty;
	private int stock;
	
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public DeliveryDTO(int id, String name, int price, int qty, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.stock = stock;
	}
	
	DecimalFormat df = new DecimalFormat("#,###");

	@Override
	public String toString() {
		return String.format("제품번호:%d | 품명:%s | 가격: %s원 | 주문가능수:%s개 | 현재재고:%s개", id, name, df.format(price), df.format(qty), df.format(stock)); 
	}
	
}
