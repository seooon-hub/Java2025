package exam01;

public class Main {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.SetOnCLickListener(new CallListener());
		btn.Touch();
		
		Button mBtn = new Button();
		mBtn.SetOnCLickListener(new CallListener());
		mBtn.Touch();
	}

}
