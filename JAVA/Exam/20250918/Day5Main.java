package day5;


public class Day5Main {

	public static void main(String[] args) {
		
		// #1 비밀번호
		PassWord pw = new PassWord();
		
		pw.setPassword("qlqjs123");
		System.out.println("내 비밀번호는 " + pw.getPassword());
		
		// #2 도서관
		
		// textbook 객체 생성
		TextBook textBook = new TextBook();
		textBook.setTitle("자바의 정석");
		textBook.setPrice(20000);
		textBook.setAuthor("남궁성");
		textBook.setSubject("컴퓨터공학");
		
		// 소설 객체 생성
		Novel novel = new Novel();
		novel.setAuthor("박정민");
		novel.setGenre("에세이");
		novel.setPrice(2000);
		novel.setTitle("쓸만한 인간");
		
		System.out.println("==전공서적 정보==");
		System.out.println("과목명: " + textBook.getSubject());
		textBook.printInfo();
		
		System.out.println("==전공서적 정보==");
		System.out.println("장르: " + novel.getGenre());
		novel.printInfo();
		
		// #3 자동차 자전거
		// 자동차
		Car car = new Car();
		car.setSpeed(30);
		System.out.println("이동 전 자동차 속도" + car.getSpeed());
		car.move();
		System.out.println("이동 후 자동차 속도" + car.getSpeed());
		
		// 자전거
		Bicycle bic = new Bicycle();
		bic.setSpeed(10);
		System.out.println("이동 전자전거 속도" + bic.getSpeed());
		bic.move();
		System.out.println("이동 후 자전거 속도" + bic.getSpeed());
		
		// #4 마을 주민
		
		// 크기가 5일 배열 생성
		Person[] perArr = new Person[5];
		
		// 객체 생성 + 정보 입력
		for (int i = 0; i < perArr.length; i++) {
			perArr[i] = new Person();
		}
		
		perArr[0].setName("한교동");
		perArr[0].setAge(41);
		
		perArr[1].setName("시나모롤");
		perArr[1].setAge(25);
		
		perArr[2].setName("포차코");
		perArr[2].setAge(37);
		
		perArr[3].setName("폼폼푸린");
		perArr[3].setAge(30);
		
		perArr[4].setName("헬로키티");
		perArr[4].setAge(52);
		
		for (int i = 0; i < perArr.length; i++) {
			System.out.println("이름: " + perArr[i].getName());
			System.out.println("나이: " + perArr[i].getAge());
		}
		
		// #5 상품 정보
		Product product = new Product();
		
		product.setName("수박주스");
		product.setPrice(4500);
		
		System.out.println(product.toString());
		
	}
	

}
