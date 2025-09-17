package ch1;

// 회원 객체
public class UserMain {

	public static void main(String[] args) {
		
//		User user = new User(); User 클래스에 기본생성자가 없기 때문에 오류
		
		// 매개변수가 있는 생성자 : 필요 정보가 빠진 객체가 생기는 걸 방지하기 위해
		User user = new User("낑깡", "abc", "1234");
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		
		System.out.println("===============");
		// 상품의 이름, 가격, 수량 출력(.toString())
		Item item1 = new Item("수박", 15000);
		System.out.println(item1.toString());
		Item item2 = new Item("귤", 15000, 10);
		System.out.println(item2.toString());
		
	}

}
