package thread.synchronization;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 스레드 비동기화 시 가능한 문제 시뮬레이션
 */

// 공유 객체
class MyData {
	int data = 3;
	
	public void plusData() {
		int mydata = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

// 공유 객체를 사용하는 스레드
class PlusThread extends Thread {
	MyData myData;
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 실행 결과: " + myData.data);
	}
}

public class NotSynchronized {
	public static void main(String[] args) {
		
		// 공유 객체 생성
		MyData myData = new MyData();
		
		// plusThread1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {} // 1초 기다림
		
		// plusThread2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
