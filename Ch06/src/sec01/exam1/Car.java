package sec01.exam1;

public class Car {
	String company;
	int maxSpeed;
	int speed;
	int rpm;
	
	public void showInfo() {
		System.out.println("Company: " + company);
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Current Speed: "+ speed);
		System.out.println("Current RPM: "+ rpm);
	}
	
	
	void SetMaxSpeed(int value) {
		maxSpeed = value;
	}
	
	public Car(String company, int maxSpeed) {
		this.company =  company;;
		this.maxSpeed = maxSpeed;
	}
	
	void Hi() {
		int value = 0;
		System.out.println("value: " + value);
	}
}
