package thread.properties;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 데몬 스레드는 주 스레드가 아닌 프로세스 내의 모든 일반 스레드가 종료돼야 종료됨을 보여주는 예제 실습
 */
public class DaemonThreadTwo {
	public static void main(String[] args) {
		
		// 일반 스레드
		Thread thread1 = new MyThreadTwo();
		thread1.setName("thread1");
		thread1.start();
		
		// 데몬 스레드
		Thread thread2 = new MyThreadTwo();
		thread2.setDaemon(true); // 데몬 스레드로 설정
		thread2.setName("thread2");
		thread2.start();
		
		// 3.5초 후 main 스레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
	}
}
