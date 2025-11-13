package exam03;

public class Main {

	public static void main(String[] args) {
		Button btn = new Button();
		Button.OnClickListener callListener = new Button.OnClickListener() {
			public void OnClick() {
				System.out.println("Make a call");
			}
		};
		
		btn.SetOnCLickListener(callListener);
		btn.Touch();
		
		btn.SetOnCLickListener(
			new Button.OnClickListener() {
				public void OnClick() {
					System.out.println("Send a Message");
				}
			}
		);
		btn.Touch();
	}

}
