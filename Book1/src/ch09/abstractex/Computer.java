package ch09.abstractex;

/* 날짜 : 2022.09.01
 * 이름 : 조수빈
 * 내용 : 추상 클래스 연습
 */
public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void tunrOff() {
		System.out.println("전원을 끕니다.");
	}
}
