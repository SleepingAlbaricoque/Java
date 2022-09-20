package ch13.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		
		// 객체 지향 방식
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl(); // 인터페이스는 인스턴스화 할 수 없으므로 인터페이스를 구현한 클래스를 만들어 그 클래스의 인스턴스 생성한 것임
		concat1.makeString(s1, s2);
		
		// 람다식 방식
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
	}
}
