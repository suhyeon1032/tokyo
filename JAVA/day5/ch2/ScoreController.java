package ch2;

import java.util.List;
import java.util.Scanner;

// 사용자 입.출력 제어
public class ScoreController {
	
	Scanner sc = new Scanner(System.in);
	private ScoreService service;

	public ScoreController(ScoreService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호 입력: 1 - 점수입력, 2 - 전체조회, 3 - 학생수, 4 - 분석, 0 - 종료");
			int q = sc.nextInt();
			sc.nextLine(); // 버퍼 정리
			
			switch (q) {
			case 1:
				System.out.println("이름: ");
				String name = sc.nextLine();
				System.out.println("국어: ");
				int kor = sc.nextInt();
				System.out.println("영어: ");
				int eng = sc.nextInt();
				System.out.println("수학: ");
				int math = sc.nextInt();
				
				service.addScore(name, kor, eng, math);
				break;
				
			case 2:
				List<ScoreDTO> scores = service.getAllScore();
				/*
				for(int i = 0; i < scores.size(); i++) {
					ScoreDTO dto = scores.get(i);
					System.out.println(dto);
				}
				*/
				if(scores.isEmpty()) { // score안에 데이터가 없으면 true 있으면 false 반환
					System.out.println("저장된 데이터가 없습니다.");
				} else {
					for (ScoreDTO dto : scores) { // score에서 순차적으로 꺼내 dto에 담아 출력
						System.out.println(dto);
					}
				}
				
				
				break;
				
			case 3:
				int studentCnt = service.getAllScore().size();
				System.out.println("등록된 전체 학생 수는 " + studentCnt + "명 입니다.");
				break;
				
			case 4:
				// 전체 학생 점수 리스트
				List<ScoreDTO> score = service.getAllScore();
				
				// 최고 총점
				if(score.isEmpty()) { // score가 빈 값이면 출력
					System.out.println("저장된 학생 리스트 없습니다.");
				} else {
					int max = service.getMaxTotal();
					System.out.println("최고 총점: " + max);
				}
				// 최저 총점
				if (score.isEmpty()) {
					System.out.println("저장된 학생 리스트 없습니다.");
				} else {
					int min = service.getMinTotal();
					System.out.println("최저 총점 : " + min);
				}
				
				// 총점 평균
				 double avg = service.getAvgTotal();				
//				System.out.println("총점 평균 : " + String.format("%.2f", avg));
				System.out.printf("총점 평균 : %.2f\n", avg);

				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("번호만 입력하세요.");
			}
		}
	}
	
	
}
