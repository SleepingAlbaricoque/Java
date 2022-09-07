package ch11.classex;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : newInstance() 메서드를 사용해 클래스 생성하기
 */
public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException{
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("ch11.classex.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}
}
