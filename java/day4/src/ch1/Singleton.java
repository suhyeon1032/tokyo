package ch1;

/*
 * 싱글톤 패턴
 * 클래스에서 오직 한 개의 갹체만 만들 수 있게 하는 디자인 패턴
 * 단 하나의 인스턴스(객체)만 존재
 * 
 * 생성자는 private, 객체는 static 변수에 저장
 * .getInstance()로 호출
 * 주로 DB연결, 로그 등 설정 관리에서 사용
 * 
 * */

public class Singleton {
	
	// 자기자신의 객체를 static으로 미리 생성
	private static Singleton instance = new Singleton();
	
	// 생성자를 private으로 막아러 외부에서 인스턴스를 만들 수 없도록 함 (new 키워드로 생성 불가)
	private Singleton() {}
	
	int numm;
	
	// 객체를 가져올 수 있는 static 메서드 작성
	public static Singleton getInstacne() {
		return instance;
	}
	

}
