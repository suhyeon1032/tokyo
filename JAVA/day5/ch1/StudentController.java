package ch1;

import java.util.List;
import java.util.Scanner;

public class StudentController {

	Scanner sc = new Scanner(System.in);

	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("1번 등록, 2번 조회, 0번 종료");
			int t = sc.nextInt();
			sc.nextLine();

			switch (t) {
			case 1:
				System.out.println("이름: ");
				String name = sc.nextLine();
				System.out.println("학번: ");
				int num = sc.nextInt();
				System.out.println("학과: ");
				String dep = sc.nextLine();
				System.out.println("나이: ");
				int age = sc.nextInt();
				
				service.addStudent(name, num, dep, age);
				System.out.println("학생 등록 완료");
				break;
			case 2:
				showStudent();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				break;
			}
		}
	}

	private void showStudent() {
		List<StudentDTO> student = service.getAllmember();
		
		for (StudentDTO stu : student) {
			System.out.println(stu);
		}
	}
}
