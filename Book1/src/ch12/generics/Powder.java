package ch12.generics;

/* 날짜 : 2022.09.10
 * 이름 : 조수빈
 * 내용 : 제네릭 클래스 사용 실습
 */
public class Powder extends Material{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Powder입니다";
	}
}
