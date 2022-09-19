package thread.properties;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 데몬 스레드 실습
 */
public class DaemonThread {
	public static void main(String[] args) {
		
		// MyThreadTwo 클래스는 NonDaemonThread 파일 참조
		// 데몬 스레드
		Thread thread2 = new MyThreadTwo();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		// 3.5초 후 main 스레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
	}
}
