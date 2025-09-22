package study1;

import java.util.List;
import java.util.Scanner;

public class GugsawonFoodController {

	Scanner sc = new Scanner(System.in);

	private GugsawonService service;

	public GugsawonFoodController(GugsawonService service) {
		super();
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1 - 등록, 2 - 조회, 0 - 프로그램 종료");
			int t = sc.nextInt();
			sc.nextLine();

			switch (t) {
			case 1:
				System.out.println("식자재 번호 입력 : ");
				int foodNum = sc.nextInt();
				System.out.println("식자재명 입력 : ");
				String foodName = sc.nextLine();
				System.out.println("수량 입력 : ");
				int foodCnt = sc.nextInt();
				System.out.println("등록날짜 입력 : ");
				int day = sc.nextInt();

				service.addGugsawonFood(foodNum, foodName, foodCnt, day);
				System.out.println("정보 등록 완료");

				break;
			case 2:
				showAnimal();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("범위 내의 숫자를 입력하세요.");
			}
		}

	}

	private void showAnimal() {
		List<GugsawonFoodDTO> gugsawon = service.getGugsawonFoodDTO();

		for (GugsawonFoodDTO food : gugsawon) {
			System.out.println(food);
		}
	}

}
