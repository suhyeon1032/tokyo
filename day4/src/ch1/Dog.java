package ch1;

public class Dog {
	// 속성(필드): 강아지 특성
	String name;
	int age;
	String type;
	String color;
	double weight;
	boolean vaccine;
	
	// 생성자(객체의 정보 입력) : 강아지 정보 입력
	public Dog(String name, int age, String type, String color, double weight, boolean vaccine) 
	{
		this.name = name;
		this.age = age;
		this.type = type;
		this.color = color;
		this.weight = weight;
		this.vaccine = vaccine;
	}
	
	// 메서드 : 강아지 동작
	void play() {
		System.out.println("잘 놉니다.");
	}
	
	void eat() {
		System.out.println("잘 먹습니다.");
	}
	
	void poopoo() {
		System.out.println("배변 산책은 중요합니다.");
	}
}
