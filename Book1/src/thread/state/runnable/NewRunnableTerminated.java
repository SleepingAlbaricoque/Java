package thread.state.runnable;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i =0; i < 1000000000L; i++) {}
			}
		};
		System.out.println("myThread state= " + myThread.getState());
		
		myThread.start();
		System.out.println("myThread state= " + myThread.getState());
		
		try {
			myThread.join();
		}catch(InterruptedException e) {}
		System.out.println("myThread state= " + myThread.getState());
	}
}
