package study1;

public class AnimalDTO {
	private String id;
	private String userName;
	private String animalName;
	private int animalAge;
	private int phoneNum;
	
	
	public AnimalDTO(String id, String userName, String animalName, int animalAge, int phoneNum) {
		this.id = id;
		this.userName = userName;
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.phoneNum = phoneNum;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getAnimalAge() {
		return animalAge;
	}
	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 보호자 이름: " + userName + ", 동물이름: " + animalName + ", 동물 나이: "
				+ animalAge + ", 연락처: " + phoneNum;
	}
	
	
	
}
