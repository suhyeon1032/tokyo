package ch1;

import java.util.Scanner;

public class Control5 {

	public static void main(String[] args) {
		// 1~10까지의 정수 중 하나를 입력 받아 홀/짝 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~10 까지의 정수 중 하나를 입력해주세요. : ");
		
		int num = sc.nextInt();
		
		if (num >= 1 && num <= 10) {
			
			if ((num %= 2) == 0) {
				System.out.println("짝");
			} else {
				System.out.println("홀");
			}
		} else {
			System.out.println("1~10 까지의 숫자를 입력해주세요.");
		}
		
		sc.close();
	}

}
