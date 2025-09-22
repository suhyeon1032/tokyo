package study1;

public class HealthDTO {
	private String userName;
	private int userNum;
	private int beforeCal;
	private int afterCal;
	
	public HealthDTO(String userName, int userNum, int beforeCal, int afterCal) {
		super();
		this.userName = userName;
		this.userNum = userNum;
		this.beforeCal = beforeCal;
		this.afterCal = afterCal;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public int getBeforeCal() {
		return beforeCal;
	}
	public void setBeforeCal(int beforeCal) {
		this.beforeCal = beforeCal;
	}
	public int getAfterCal() {
		return afterCal;
	}
	public void setAfterCal(int afterCal) {
		this.afterCal = afterCal;
	}

	@Override
	public String toString() {
		return "회원 명: " + userName + " 회원 번호: " + userNum + " 기준 칼로리: " + beforeCal + " 소비 칼로리: "
				+ afterCal;
	}
	
	
}
