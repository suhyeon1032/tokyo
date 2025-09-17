package ch1;

public class User {
	
	// 필드 == 속성 == 사용자의 특성 정의
	private String name;
	private String id;
	private String password;

	// 매개 변수가 있는 생성자
	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

//	public User() {} 기본 생성자. 내가 작성하지 않아도 자바가 기본적으로 만들어주지만, 다른 생성자를 직접 만들게 되면 기본 생성자도 작성해야 함
	
	// getter 메서드
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
