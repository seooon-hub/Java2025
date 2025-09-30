package sec01.exam1;

public class MainClass {

	public static void main(String[] args) {
		Student stl = new Student();
		//stl.SayHello();
		Car c = new Car("Hyundai", 200);
		//c.SetMaxSpeed(100);
		//c.maxSpeed = 200;
		//c.showInfo();
		
		Calcul cal = new Calcul();
		int val = cal.addInt(1, 3);
		double vald = cal.addDouble(1.0, 2.0);
		System.out.println("Value: " + vald);
	}

}
