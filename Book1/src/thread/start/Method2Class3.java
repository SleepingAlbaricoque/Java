package thread.start;

/* 날짜 : 2022.09.19
 * 이름 : 조수빈
 * 내용 : 이너 클래스를 활용한 스레드 객체 생성 및 실행
 */
public class Method2Class3 {
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
				try{Thread.sleep(10);} catch (InterruptedException e) {}
				
				for (int i=0; i <strArray.length; i++) {
					System.out.println(" - (자막 번호)" + strArray[i]);
				try{Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int[] intArray = {1, 2, 3, 4, 5};
				
				for (int i =0; i < intArray.length; i++) {
					System.out.println("(비디오 프레임) " + intArray[i]);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
