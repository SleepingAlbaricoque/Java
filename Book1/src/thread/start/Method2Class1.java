package thread.start;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : Runnable 인터페이스를 구현하여 두 개의 스레드 활용
 */

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i =0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호)" + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Method2Class1 {
	public static void main(String[] args) {
		
		Runnable smiFileRunnable = new SMIFileRunnable();
		
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		for (int i =0; i < intArray.length; i++) {
			System.out.println("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
