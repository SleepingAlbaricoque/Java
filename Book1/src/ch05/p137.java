package ch05;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 결과 값 반환하는 함수 구현하고 호출하기
 */
public class p137 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(sum);
		
		add2(num1, num2);
		
	}

	public static int add(int n1, int n2) {
	
		int result = n1 + n2;
		return result;
	}

	public static void add2(int n1, int n2) {
		
		System.out.println(n1 + n2);
	}
}