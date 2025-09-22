package study1;

public class GugsawonFoodDTO {

	private int foodNum;
	private String foodName;
	private int foodCnt;
	private int day;
	
	public GugsawonFoodDTO(int foodNum, String foodName, int foodCnt, int day) {
		this.foodNum = foodNum;
		this.foodName = foodName;
		this.foodCnt = foodCnt;
		this.day = day;
	}
	
	public int getFoodNum() {
		return foodNum;
	}
	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodCnt() {
		return foodCnt;
	}
	public void setFoodCnt(int foodCnt) {
		this.foodCnt = foodCnt;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "식자재 번호: " + foodNum + " 식자재명: " + foodName + " 수량: " + foodCnt + " 등록날짜"
				+ day;
	}
	
	
}
