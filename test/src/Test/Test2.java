package Test;

public class Test2 {
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.move();
		car.setSpeed(120);
		
		car.speedUp();
		System.out.println(car.speed);
	}
}

class Vehicle {
	public int speed;
	public int size;
	public void move() {
		System.out.println("I'm moveing!!!");
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void speedUp() {
		this.speed += 100;
	}
	
	public void speedDown() {
		this.speed -= 20;
	}
}
