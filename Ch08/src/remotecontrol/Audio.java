package remotecontrol;

public class Audio implements RemoteControl{
	int volume;
	
	public void TurnOn() {
		System.out.println("Turn On Audio");
	}
	
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Audio Volume: " + volume);
	}
}
