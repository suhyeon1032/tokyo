package Exam;

import java.util.Scanner;

public class day2Ex {

	public static void main(String[] args) {
		
		System.out.println("#1 =================");
		String pw = "qwer1234";
		if (pw == "qwer1234") {
			System.out.println("비밀번호가 맞아요!!!");
		} else {
			System.out.println("비밀번호가 틀렸어요!!ㅜㅜ");
		}
		
		System.out.println("#2 =================");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비밀번호를 입력해주세요. : ");
		String userPw = sc.nextLine();
		System.out.println(userPw);
		if (userPw.equals("qwer1234")) {
			System.out.println("비밀번호가 맞아요!!!");
		} else {
			System.out.println("비밀번호가 틀렸어요!!ㅜㅜ");
		}
		
		System.out.println("#3 =================");
		
		String animal = "강아지";
		switch (animal) {
		case "강아지" : {
			System.out.println("멍멍");
			break;
		} case "고양이" : {
			System.out.println("야옹");
			break;
		}
		default:
			System.out.println("무슨 동물이야?");
		}
		
		System.out.println("#4 =================");
		System.out.println("좋아하는 동물을 입력하세요 : ");
		String userAnimal = sc.nextLine();
		switch (userAnimal) {
		case "강아지" : {
			System.out.println("멍멍");
			break;
		} case "고양이" : {
			System.out.println("야옹");
			break;
		}
		default:
			System.out.println("무슨 동물이야?");
		}
		
		System.out.println("#5 =================");
		
		String day = "일요일";
		String answer;
		if (day.equals("토요일") || day.equals("일요일")) answer = "주말";
		else answer = "주중";
		
		System.out.println(answer);
		
		
		System.out.println("#6 =================");
		
		
		String day2 = sc.nextLine();
		if (day2.equals("토요일") || day2.equals("일요일")) answer = "주말";
		else answer = "주중";
		
		System.out.println(answer);
		
		System.out.println("#7 =================");
		
		int age = sc.nextInt();
		String answer2 = age >= 20 ? "성인입니다." : "미성년입니다."; 
		System.out.println(answer2);
		
		System.out.println("#8 =================");
		
		System.out.println("오늘 마신 커피 수를 입력하세요.");
		int coffee = sc.nextInt();
		
		switch (coffee) {
		case 0: {
			System.out.println("여긴 어디?");
		} case 1: {
			System.out.println("완전 맑은 정신~ 🍀");
		} case 2: {
			System.out.println("완전 맑은 정신~ 🍀");
		}
		default:
			System.out.println("기분 좋은 상태!");
		}
		
		System.out.println("#9 =================");
		
		int num = sc.nextInt() % 2;
		if (num == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		sc.close();
	}
	

}
