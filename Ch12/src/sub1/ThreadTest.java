package sub1;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 스레드 실습하기
 * 
 * 스레드(Thread)
 * - 하나의 프로세스 안에서 실행되는 실행 흐름
 * - Thread 클래스를 상속받아 start() 메서드로 run() 메서드 실행
 * - 웹 프로그래밍 보다는 주로 네트워크 프로그래밍에서 사용
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 스레드는 비동기 방식(병행 방식; Asynchronize)으로 실행 <-> synchronized는 순차적으로 진행
		st1.start();
		st2.start();
		
		for(int i =1; i <=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main 스레드 실행");
		}
		
		System.out.println("Main 스레드 종료");
	}
}
