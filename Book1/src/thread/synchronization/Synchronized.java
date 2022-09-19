package thread.synchronization;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 동기화 메서드 실습
 */

class MyData2 {
	int data = 3;
	
	public synchronized void plusData2() {
		int mydata = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

class PlusThread2 extends Thread {
	MyData2 myData;
	
	public PlusThread2(MyData2 myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData2();
		System.out.println(getName() + " 실행 결과: " + myData.data);
	}
}

public class Synchronized {
	public static void main(String[] args) {
		
		MyData2 myData = new MyData2();
		
		Thread plusThread1 = new PlusThread2(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread2(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
