package thread.keyobject;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 동기화 메서드와 동기화 블럭이 다른 열쇠를 사용할 때
 */
class MyData2 {
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
		synchronized(new Object()) {
			for (int i =0; i < 3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
}

public class KeyObject2 {
	public static void main(String[] args) {
		
		MyData2 myData = new MyData2();
		
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
