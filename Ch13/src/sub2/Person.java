package sub2;

public class Person { // 멤버 변수 두 개를 하나로 엮어놓은 구조체; class 역시 자료 구조화 하기 위한 구조체
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
