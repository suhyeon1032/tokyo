package ch1;

public class SingletonMain {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton(); // 싱글톤패턴에선 사용 불가능 함 

		Singleton s1 = Singleton.getInstacne();
		Singleton s2 = Singleton.getInstacne();
		
		Bread b1 = new Bread();
		Bread b2 = new Bread();
		
		System.out.println("싱글톤 패턴 : " + (s1 == s2)); // true
		System.out.println("일반 객체 : " + (b1 == b2)); // false
	}

}
