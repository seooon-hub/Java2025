package exam02;

public class Main {
	
	public static void main(String[] args) {
		Button callBtn = new Button();
		callBtn.SetOnCLickListener(new CallListener());
		callBtn.Touch();
		
		Button mBtn = new Button();
		mBtn.SetOnCLickListener(new MessageListener());
		mBtn.Touch();
	}
}
