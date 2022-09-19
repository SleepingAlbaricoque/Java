package thread.start;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : Thread 직접 상속하여 세 개의 스레드 활용
 */

// SMIFileThread 클래스는 Method1Class1 파일 참조

class VideoFileThread extends Thread {
	@Override
	public void run() {
		// 비디오 프레임 번호 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 번호 출력
		for (int i =0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Method1Class2 {
	public static void main(String[] args) {
		
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
	}
}
