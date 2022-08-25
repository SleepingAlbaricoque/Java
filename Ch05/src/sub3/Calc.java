package sub3;

/*
 * 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : singleton 연습
 */
public class Calc {
	
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc () {} //외부에서 Calc 생성자 호출 불가; 원래는 이 디폴트 생성자가 public이라 외부에서 호출 가능했음
	

	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y ;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
