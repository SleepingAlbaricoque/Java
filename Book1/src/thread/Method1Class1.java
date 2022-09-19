package thread;

/* 날짜 : 2022.06.19
 * 이름 : 조수빈
 * 내용 : Thread 클래스 직접 상속하여 두 개의 스레드 활용
 */
class SMIFileThread extends Thread {
	@Override
	public void run() {
		// 자막 번호 하나~다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 자막 번호 출력
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

public class Method1Class1 {
	public static void main(String[] args) {
		
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		// 비디오 프레임 번호 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 번호 출력
		for (int i =0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
