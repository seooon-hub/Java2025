package exam01;

public class Button {
	OnClickListener listener;
	
	public void SetOnCLickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void Touch() {
		if(listener != null) {
			listener.OnClick();
		}
	}
	
	public interface OnClickListener {
		void OnClick();
	}
}
