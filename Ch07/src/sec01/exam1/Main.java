package sec01.exam1;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(100);
		Truck truck = new Truck(80, 200);
		
		
		truck.ShowSpeed();
		car = truck;
		car.ShowSpeed();
		
		System.out.println("Car speed is " + car.speed);
		System.out.println("Truck speed is " + car.speed);
		
		
	}

}
