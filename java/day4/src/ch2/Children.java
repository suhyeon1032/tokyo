package ch2;

/* 
 * 자식 클래스
 * class 클래스명 extends 부모클래스(수퍼클래스)명 {}
 * 
 * */
public class Children extends Parents {
	// 필드
	double field3;
	
	// 생성자
	public Children() {}
	
	
	public Children(int field1, String field2, double field3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	// 메서드
	@Override
	public void method2() {
		System.out.println("부모 메서드");
	}
	
	public void method3() {
		System.out.println("자식 메서드");
	}
}
