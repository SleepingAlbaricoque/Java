package ch05.constructor;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 생성자 테스트하기 p.153 p.158
 */
public class Person2Test {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person personLee = new Person("이순신", 175, 75);
		
		Person personPark = new Person("박혁거세");
		
	}
}
