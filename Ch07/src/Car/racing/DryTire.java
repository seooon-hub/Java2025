package Car.racing;

public class DryTire extends Tire{
	DryTire(int capacity, int consume){
		super(capacity, consume);
	}
	
	boolean IsAbailable() {
		if(Env.isRain) return false;
		return capacity - consume > 0;
	}
}
