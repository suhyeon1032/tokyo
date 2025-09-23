package ch2;

import java.util.List;

public class ScoreService {

	private ScoreDAO dao;

	// 의존성 주입 : 외부 DAO를 받아 내부 변수로 저장. 교체 용이
	public ScoreService(ScoreDAO dao) {
		this.dao = dao;
	}

	// 점수 입력, 계산 // 컨트롤러에서 넘어온 값 처리
	public void addScore(String name, int kor, int eng, int math) {

		ScoreDTO dto = new ScoreDTO(name, kor, eng, math);

		int total = kor + eng + math;
		double avg = total / 3.0;
		String grade = getGrade(avg);

		dto.setTotal(total);
		dto.setAvg(avg);
		dto.setGrade(grade);

		dao.save(dto);
	}

	private String getGrade(double avg) {

		if (avg >= 90)
			return "A";
		else if (avg >= 80)
			return "B";
		else if (avg >= 70)
			return "C";
		else if (avg >= 60)
			return "D";
		else
			return "F";
	}

	public List<ScoreDTO> getAllScore() {
		return dao.findAll(); // DAO 에 저장된 학생 점수 리스트 전부 반환
	}

	public int getMaxTotal() {
		// 저장된 학생 리스트
		List<ScoreDTO> scores = getAllScore();

		int max = Integer.MIN_VALUE; // 가장 작은 int 값
		if (scores.isEmpty())
			return 0;
		// 최대값을 찾을 때 시작값으로 제일 작은 값으로 시작
		else {
			for (ScoreDTO dto : scores) {
				// 이전 값과 현재 값을 비교해서 더 큰 값을 max에 재 할당
				max = dto.getTotal() > max ? dto.getTotal() : max;
			}
		}
		return max;
	}

	public int getMinTotal() {
		List<ScoreDTO> scores = getAllScore();

		int min = Integer.MAX_VALUE;
		if (scores.isEmpty())
			return 0;
		else {
			for (ScoreDTO dto : scores) {
				min = dto.getTotal() < min ? dto.getTotal() : min;
			}
		}
		return min;
	}

	public double getAvgTotal() {
		List<ScoreDTO> scores = getAllScore();

		if (scores.isEmpty())
			return 0.0;

		// 전체 학생 총점의 합
		int sum = getSumTotal();

		return sum / scores.size();
	}

	private int getSumTotal() {
		List<ScoreDTO> scores = getAllScore();
		int sum = 0;
		for (ScoreDTO dto : scores) { 
			sum += dto.getTotal();
		}
		return sum;

	}

}
/*
 * 상수 한 번 값이 대입되면 절대 바꿀 수 없는 값 fimal 키워드 사용 전부 대문자로 작성. 띄어쓰기의 경우 _(언더스코어)로 표기
 * MAX_VALUE, PI
 * 
 * 공용 상수 Integer.MIN_VALUE, Integer.MAX_VALUE 여러 곳에서 쓸 수 있도록 public static
 * final로 선언 객체 생성 없이 ㅡㄹ래스 이름으로 바로 접근 가능
 */
