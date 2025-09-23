package ch1;

import java.util.List;
import java.util.Scanner;

// 사용자 입/출력 제어
public class MemberController {

	Scanner sc = new Scanner(System.in);

	private MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}

	public void run() {

		while (true) {
			System.out.println("번호입력: 1-회원입력, 2-회원출력, 0-프로그램종료");
			int q = sc.nextInt(); // nextInt로 값을 입력받고 문자열로 입력 받으면 숫자 뒤에 \n(ex. 90\n)을 갖고 있어서 자동으로 2개가 한꺼번에 나옴
			sc.nextLine(); // 바로 읽어서 버림. 버퍼 정리
			
			switch (q) {
			case 1:
				System.out.println("이름: ");
				String name = sc.nextLine();
				System.out.println("아이디: ");
				String id = sc.nextLine();
				System.out.println("이메일: ");
				String email = sc.nextLine();
				
				service.addMember(name, id, email); // MemberService의 addMember호출
				System.out.println("회원 등록");
				break;
			case 2: // case에 직접 작성해도 되고 메서드를 생성해서 호출해도 된다.
				showMember();
				/*// case에 직접 작성
				 * List<MemberDTO> member = service.getAllmember(); 
				
				for(int i = 0; i < member.size(); i++) {
					MemberDTO dto = member.get(i); // dto 에서 값을 가져와서
					System.out.println(dto); // 출력해준다
				}*/
				break;
			case 0:
				System.out.println("프로그램 종료");
				return; // 즉시 종료

			default:
				System.out.println("올바른 숫자만 입력하세요.");
			}

		}

	}
	
	void showMember() {
		List<MemberDTO> member = service.getAllmember();
		
		
		/*
		for(int i = 0; i < member.size(); i++) {
			MemberDTO dto = member.get(i); // dto 에서 값을 가져와서
			System.out.println(dto); // 출력해준다
		}
		*/
		
		/*
		// 향상된 for문
		for(타입 변수명 : 컬렉션이나 배열) {
			실행문
		}
		*/
		
		for (MemberDTO dto : member) { // member 리스트에서 순차적으로 꺼내 dto에 담아 출력
			System.out.println(dto);
		}
		
	}

}
