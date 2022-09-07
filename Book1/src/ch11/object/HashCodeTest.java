package ch11.object;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : hashcode() 메서드 실습
 */
public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}
}
