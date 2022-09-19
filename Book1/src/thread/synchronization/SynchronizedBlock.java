package thread.synchronization;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 블록 동기화 실습
 */
class MyData3 {
	int data = 3;
	
	public void plusData() {
		synchronized (this) {
			int mydata = data;
			try {Thread.sleep(2000);} catch (InterruptedException e) {}
			data = mydata + 1;
		}
	}
}

class PlusThread3 extends Thread {
	MyData3 myData;
	
	public PlusThread3(MyData3 myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 실행 결과: " + myData.data);
	}
}

public class SynchronizedBlock {
public static void main(String[] args) {
		
		MyData3 myData = new MyData3();
		
		Thread plusThread1 = new PlusThread3(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {} // 1초 기다림
		
		Thread plusThread2 = new PlusThread3(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
