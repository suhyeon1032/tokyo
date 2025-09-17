package ch1;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		
		//Random 랜덤 도구 객체 설정
		Random ran = new Random(); 
		
		int result = ran.nextInt(2); // 2 전까지의 값 중 랜덤 수
		if (result == 0) {
			System.out.println("등교");
		} else System.out.println("자체 휴강");
	}

}
