package sec04.exam1;

public class Car {
	int gas;
	int minGas; //한바퀴 돌 때 필요한 Gas
	String teamName;
	String color;
	static int numberOfCars;
	
	Car(int gas, int minGas,String teamName, String color){
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
	}
	
	Boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("연료 보충 필요");
			return false;
		}
		
		System.out.println("연료 보충 불필요");
		return true;
	}
	
	void AddGas(int gas) {
		System.out.println("연료 충전");
		this.gas += gas;
	}
	
	void RunOneRound() {
		System.out.println("한바퀴 완주");
		this.gas -= gas;
	}
	
	int Plus(int a, int b) {
		return a + b;
	}
	
	double Plus(double b, int a) {
		return a + b;
	}
	
	double Plus(int b, double a) {
		return a + b;
	} 
	
	int Plus(int b, int a) {
		return a + b;
	}
	
	void ShowNumberOfCars() {
		System.out.println(numberOfCars);
	}
}