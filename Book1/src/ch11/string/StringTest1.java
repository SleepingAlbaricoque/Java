package ch11.string;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : String 클래스 주소 값 비교하기
 */
public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
