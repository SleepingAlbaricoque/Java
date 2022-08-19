package sub01;


/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 내용 : 자바 연산자 연습문제
 * 
 */
public class Test03 {

	public static void main(String[] args) {
		
		int num =1;
		int result =0;
		// 변수 = 0 은 변수를 초기화하는 것
		
		result = num++;
		System.out.println("result : " +result);
		
		result = ++num;
		System.out.println("result : " +result);
		
		result = num--;
		System.out.println("result : " +result);
		
		result = --num;
		System.out.println("result : " +result);
	}
}
