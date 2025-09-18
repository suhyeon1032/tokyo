package day5;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public void printInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price + "원");
	}


	// getter & setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
