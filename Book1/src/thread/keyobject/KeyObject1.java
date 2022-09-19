package thread.keyobject;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 세 개의 동기화 영역이 동일한 열쇠로 동기화되었을 때
 */
class MyData {
	synchronized void abc() {
		for (int i =0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	synchronized void bcd() {
		for (int i =0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}	
	}
	
	void cde() {
		synchronized (this) {
			for (int i =0; i < 3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
}

public class KeyObject1 {
	public static void main(String[] args) {
		
		// 공유 객체
		MyData myData = new MyData();
		
		// 세 개의 스레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
	}
}
