package study1;

import java.util.List;
import java.util.Scanner;

public class HealthController {
	Scanner sc = new Scanner(System.in);

	private HealthService service;

	public HealthController(HealthService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1 - 등록, 2 - 조회, 0 - 프로그램 종료");
			int t = sc.nextInt();
			sc.nextLine();

			switch (t) {
			case 1:
				System.out.println("회원명 입력 : ");
				String userName = sc.nextLine();
				System.out.println("회원번호 입력 : ");
				int userNum = sc.nextInt();
				System.out.println("기준칼로리 입력 : ");
				int beforCal = sc.nextInt();
				System.out.println("소비칼로리 입력 : ");
				int afterCal = sc.nextInt();

				service.addHealth(userName, userNum, beforCal, afterCal);
				System.out.println("정보 등록 완료");

				break;
			case 2:
				showHealth();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("범위 내의 숫자를 입력하세요.");
			}
		}
	}

	private void showHealth() {
		List<HealthDTO> health = service.getHealthDTO();

		for (HealthDTO heal : health) {
			System.out.println(heal);
		}
	}

}
