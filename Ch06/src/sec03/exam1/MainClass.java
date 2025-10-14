package sec03.exam1;

public class MainClass {

	public static void main(String[] args) {
		Car c1 = new Car();
		//sec01.exam1.Car c2 = new sec01.exam1.Car(null, 0);
		Car c2 = new Car("Hyundai");
		Car c3 = new Car("Kia", "sedan");
		Car c4 = new Car("Kia", "Truck", 150);

		c1.ShowInfo();
		c2.ShowInfo();
		c3.ShowInfo();
		c4.ShowInfo();
		System.out.println(" ");
	}

}
