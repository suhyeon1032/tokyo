package ch1;

public class MethodEx2 {
	
	// 컵라면 계산
	public static int cupRamen(int kcal) {
		return kcal * 500;
	}
	
	// 컵라면 계산 메서드
	public static int pay(int money, int cnt) {
		return money * cnt;
	}

	public static void main(String[] args) {
		// 컵라면 칼로리 계산 메소드
		System.out.println(cupRamen(3));// kcal
		
		// 컵라면 계산 메서드
		System.out.println(pay(1500, 11));
	}

}
