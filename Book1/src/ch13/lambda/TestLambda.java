package ch13.lambda;

/* 날짜 : 2022.09.20
 * 이름 : 조수빈
 * 내용 : 매개변수로 전달하는 람다식
 */
interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
		public static void showMyString(PrintString p) {
			p.showString("hello lambda_2");
	}
		
		public static PrintString returnString() {
			return s -> System.out.println(s + "world");
		}
}
