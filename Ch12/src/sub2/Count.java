package sub2;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭: 스레드 간 경합을 막고 동기 방식으로 실행
	public synchronized void setNum() { // 들어오는 스레드들이 동기 방식으로 실행되도록 synchronized 붙임, 스레드 하나가 들어가면 락을 걸어서 나머지 스레드들은 대기
		num++;
	}
}
