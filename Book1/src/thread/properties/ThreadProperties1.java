package thread.properties;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 스레드 객체의 속성 다루기
 */
public class ThreadProperties1 {
	public static void main(String[] args) {
		
		// 객체 참조하기, 스레드의 개수 가져오기
		Thread curThread = Thread.currentThread();
		System.out.println("현재 스레드의 이름 = " + curThread.getName());
		System.out.println("동작하는 스레드의 개수 = " + Thread.activeCount());
		
		// 스레드 이름 자동 지정
		for (int i =0; i <3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 스레드 이름 직접 지정
		for (int i =0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 스레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 스레드 이름 자동 지정
		for (int i =0; i <3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 스레드의 개수 가져오기
		System.out.println("동작하는 스레드의 개수 = " + Thread.activeCount());
		
	}
}