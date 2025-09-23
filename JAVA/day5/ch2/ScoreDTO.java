package ch2;

/*
 * 요구사항
 * 학생 점수 관리 프로그램
 * 
 * 이름, 국어, 영어, 수학 입력
 * 총점, 평균, 학점
 * 
 * */
public class ScoreDTO {
	
	private String name;
	private int kor, eng, math;
	private int total; // 생성자 만들지 x
	private double avg;
	private String grade;
	
	public ScoreDTO() {
		
	}

	public ScoreDTO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "이름: " + name + 
				", 국어: " + kor + 
				", 영어: " + eng + 
				", 수학: " + math + 
				", 총점: " + total + 
				", 평균: " + String.format("%.2f", avg) + 
				", 학점: " + grade;
	}
	
	
}
/*
 * String.format("%.2f", avg); avg를 소수점 두 번째 자리에서 반올림해서 문자열로 반환. 실수 값.
 * 
 * .forMat("%d", total); 정수
 * .format("%d", name); 문자열
 * .format("%c", name); 문자 한글자
 * */
