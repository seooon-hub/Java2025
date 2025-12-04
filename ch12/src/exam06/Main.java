package exam06;

public class Main {
	public static void main(String[] args)  {
		Thread thread = new PrintThread1();
		Thread.start();
		
		Thread.sleep(1000);
		
//		thread.SetStop(true);
		thread.Interrupt();
	}
}


