package thread;

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
					
				}
			}
		}
	}
}
