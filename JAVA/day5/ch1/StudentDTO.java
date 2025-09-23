package ch1;

/*
 * 학생 관리 프로그램
 * 이름, 학번, 학과, 나이
 * 
 * 등록
 * 조회
 * 프로그램 종료
 * */

public class StudentDTO {
	private String name;
	private int num;
	private String dep;
	private int age;
	
	public StudentDTO() {
		
	}

	public StudentDTO(String name, int num, String dep, int age) {
		this.name = name;
		this.num = num;
		this.dep = dep;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "학생 이름: " + name + "학번: " + num + "학과: " + dep + "나이: " + age;
	}
	
	
}
