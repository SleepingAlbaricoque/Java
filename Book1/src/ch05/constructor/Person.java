package ch05.constructor;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 생성자 만들기 p.153 p.154 p.157
 */
public class Person {

	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	

}
