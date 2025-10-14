package sec03.exam1;

public class Car {
//	String company = "kia";
//	String model = "sedan";
//	int maxSpeed;
		
	String company;
	String model;
	int maxSpeed;
	
	public Car() {
		
	}
	
	public Car(String company) {
		this.company = company;
	}
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public Car(String company, String model, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	public void ShowInfo() {
		System.out.println("Company: " + company);
		System.out.println("Model: " + model);
		System.out.println("MaxSpeed: " + maxSpeed);
	}
}
