package ch1;
/*
 * 요구사항 분석
 * 
 * 회원정보: 이름, 아이디, 이메일
 * 기능: 
 * 	회원 등록(이름)
 * 	전체 회원 조회(출력)
 * 	프로그램 종료
 * 
 * */

// 회원 정보
public class MemberDTO {
	
	private String name;
	private String id;
	private String email;
	
	// 기본 생성자
	public MemberDTO() {
		
	}

	public MemberDTO(String name, String id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "이름: " + name + " id: " + id + " email: " + email;
	}

	
	
}
