package ch10.scheduler;

/* 날짜 : 2022.09.03
 * 이름 : 조수빈
 * 내용 : 인터페이스 실습
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
