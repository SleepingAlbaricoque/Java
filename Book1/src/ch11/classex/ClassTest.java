package ch11.classex;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : Person.class 파일의 클래스 정보 가져오기
 */
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		System.out.println(pClass2);
	}
}
