package ch2;

/*
 * 상속 Inheritance
 * 부모 클래스의 속성과 기능을 자식 클래스가 물려 받는 것
 * 코드 재사용, 유지보수(부모 코드를 수정하면 자식도 수정)가 용이
 * 계층 구조 설계 가능
 * 
 * */

public class Parents {
	
	// 필드
	int field1;
	String field2; 
	
	// 생성자
	public Parents(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
		
	}
	
	public Parents() {
		
	}
	
	// 메서드
	public void method1() {
		System.out.println("부모 메서드1");
	}
	
	public void method2() {
		System.out.println("부모 메서드2");
	}
	
	
}
