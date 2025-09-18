package day5;

public class Car implements Vehicle {

	private int speed;
	
	
	// getter & setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	// 인터페이스에 정의된 메서드 구현
	@Override
	public void move() {
		this.speed += 50;
	}
	
}
