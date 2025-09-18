package day5;

public class TextBook extends Book{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 오버라이딩
//	@Override
//	public void printInfo() {
//		System.out.println("과목명: " + subject);
//	}
	
	
}
