package sub3;

public class AddThread extends Add implements Runnable { // Add, Thread 두 클래스 한 번에 상속받는 건 Java 기능상 안돼서 인터페이스 Runnable을 대신 implement
	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int k =start; k <=end; k++) {
			setNum(k);
		}
	}
}
