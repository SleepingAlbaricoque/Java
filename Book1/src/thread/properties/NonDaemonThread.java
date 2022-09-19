package thread.properties;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 데몬 설정이 false인 일반 스레드
 */
class MyThreadTwo extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + ": " +(isDaemon()? "데몬 스레드": "일반 스레드"));
		for (int i =0; i < 6; i++) {
			System.out.println(getName() + ": " + i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class NonDaemonThread {
	public static void main(String[] args) {
		
		// 일반 스레드
		Thread thread1 = new MyThreadTwo();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		
		// 3.5초 후 main 스레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
	}
}
