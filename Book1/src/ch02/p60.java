package ch02;

/* 날짜 : 2022.08.21
 * 이름 : 조수빈
 * 내용 : 자료형 없이 변수 선언 w/ var
 */
public class p60 {

	public static void main(String[] args) {
		
		var i =10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; str변수는 이미 string형으로 사용되어 정수 값 넣을 수 없음
		
		System.out.println(str);
	}
}
