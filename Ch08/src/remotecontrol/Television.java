package remotecontrol;

public class Television implements RemoteControl {
	int volume;
	
	public void TurnOn() {
		System.out.println("Turn On TV");
	}
	
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("TV Volume: " + volume);
	}

}
