package exam1;

public class Sav extends Acc{
	int bal;
	
	Sav(int bal){
		super(bal);
	}
	
	void ShowBal() {
		System.out.println("Acc bal : " + bal);
	}
}
