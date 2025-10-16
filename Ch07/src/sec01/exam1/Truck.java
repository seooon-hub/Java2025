package sec01.exam1;

public class Truck extends Car{
	int speed;
	int load;
	
	Truck(int speed, int load){
		super(speed);
//		this.speed = speed;
		this.load = load;
	}
	
	void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
	
	void ShowLoad() {
		System.out.println("Load : " + load);
	}
}
