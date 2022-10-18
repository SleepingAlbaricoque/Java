package part9.inheritance;

/* 날짜 : 2022.10.18
 * 이름 : 조수빈
 * 내용 : 상속 실습하기
 */
class A{
	public void a() {
		System.out.println("A");
	}
}

class B extends A {
	public void b() {
		System.out.println("B");
	}
}

class C extends B{
	public void c() {
		System.out.println("C");
	}
}

public class ABC {
	public static void main(String[] args) {
		C c = new C();

		c.a();
		c.b();
		c.c();
	}
}
