package study1;

import java.util.List;
import java.util.Scanner;

public class AnimalController {
	Scanner sc = new Scanner(System.in);

	private AnimalService service;

	public AnimalController(AnimalService service) {
		this.service = service;
	};

	public void run() {
		while (true) {
			System.out.println("1 - 등록, 2 - 조회, 0 - 프로그램 종료");
			int t = sc.nextInt();
			sc.nextLine();

			switch (t) {
			case 1:
				System.out.println("아이디 입력 : ");
				String id = sc.nextLine();
				System.out.println("보호자명 입력 : ");
				String userName = sc.nextLine();
				System.out.println("반려 동물명 입력 : ");
				String animalName = sc.nextLine();
				System.out.println("반려 동물 나이 입력 : ");
				int animalAge = sc.nextInt();
				System.out.println("연락처 입력(숫자만 입력하세요.) : ");
				int phoneNum = sc.nextInt();
				
				service.addAnimal(id, userName, animalName, animalAge, phoneNum);
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
		List<AnimalDTO> animal = service.getAnimalDTO();
		
		for (AnimalDTO ani : animal) {
			System.out.println(ani);
		}
	}
}
