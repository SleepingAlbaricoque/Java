package sub2;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 스레드 조인 실습하기
 * 
 * 스레드 Join
 * - 메인 스레드에서 파생된 자식 스레드 작업이 완료된 후 다시 메인 스레드로 합류
 * - 메인 스레드에서 자식 스레드 작업완료 대기
 */
public class ThreadJoinTest {
	public static void main(String[] args) throws InterruptedException{
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start(); // ct1.run();일 때는 메인 스레드가 run메서드 직접 호출 -> c1.run 수행 끝나면 c2.run 하는 식으로 진행 -> 결과값은 3000
		ct2.start(); // start();일 때는 세 스레드가 비동기 실행 -> 스레드끼리 먼저 실행하려고 경합하여 두 세 개가 동시에 실행되는 경우가 있음(그래서 num++이 3씩 증가하는 것이 아니라 1, 2씩만 증가할 때도 있음) -> 결과값이 3000 이하
		ct3.start(); // Count 클래스의 setNum()메서드(num++ 실행)를 synchronized로 만들면 결과값은 무조건 3000
		
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과: " + count.getNum());
	}
}
