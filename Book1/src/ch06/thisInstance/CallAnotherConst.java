package ch06.thisInstance;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : this로 다른 생성자 호출하기 p.172 p.173
 */

class Person {
	String name;
	int age;
	
	Person () {
		this("no data", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItself() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person ();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItself();
		System.out.println(p);
		System.out.println(noName);
		
	}
}