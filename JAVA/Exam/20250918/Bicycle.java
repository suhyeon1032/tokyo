package day5;

public class Bicycle implements Vehicle {
	private int speed;

	
	// getter setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		this.speed += 30;
	}
	
	
}
