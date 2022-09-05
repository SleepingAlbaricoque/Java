package sub2;

/* 날자 : 2022.09.05
 * 이름 : 조수빈
 * 내용 : 예외던지기 실습하기
 * 
 * throws : 메서드에 선언
 * throw : 예외 던지기
 */
public class ThrowTest {
	public static void main(String[] args) {
		
	Calc cal = Calc.getInstance();
	
	int r1 = cal.plus(1, 2);
	int r2 = cal.minus(1, 2);
	
	int r3 = 0;
	int r4 = 0;
	
	try {
		r3 = cal.multi(2, 0);
		r4 = cal.div(4, 0);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	System.out.println("r1 : " + r1);
	System.out.println("r2 : " + r2);
	System.out.println("r3 : " + r3);
	System.out.println("r4 : " + r4);
	
	}
}
