package ch13.lambda;

/* 날짜 : 2022.09.20
 * 이름 : 조수빈
 * 내용 : 클래스에서 인터페이스 구현하기
 */
public class StringConCatImpl implements StringConcat{
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
}
