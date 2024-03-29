package thread.state.timedwaiting;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println(" -- sleep() 진행 중 interrupt() 발생");
			for(long i =0; i < 1000000000000000000L; i++) {} // 프린트하기 전에 terminate 안되게 하려고
		}
	}
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch(InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
		
		myThread.interrupt();
		try {Thread.sleep(100);} catch(InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
	}
}
