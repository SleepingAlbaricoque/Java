package ch09.finalex;

/* 날짜 : 2022.09.01
 * 이름 : 조수빈
 * 내용 : final 변수 예제
 */
public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		// cons.NUM = 200; 상수에 새로운 값을 대입하려 하므로 오류남
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
