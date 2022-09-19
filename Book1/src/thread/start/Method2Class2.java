package thread.start;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : Runnable 인터페이스를 구현하여 세 개의 스레드 활용
 */

// SMIFileRunnable 클래스는 Method2Class1 파일 참조

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};
		
		for(int i =0; i < intArray.length; i++) {
			System.out.println("(비디오 프레임)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Method2Class2 {
	public static void main(String[] args) {
		
		Runnable smiFileRunnable = new SMIFileRunnable();
		
		Thread thread1 = new Thread(smiFileRunnable);
		thread1.start();
		
		Runnable videoFileRunnable = new VideoFileRunnable();
		
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();
	}
}
