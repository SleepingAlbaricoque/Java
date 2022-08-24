package ch05;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 클래스 생성 후 결과 값 출력
 */
public class Man {

	int age;
	String name;
	boolean isMarried;
	int children;
	
	void show() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(isMarried);
		System.out.println(children);
	}
		
	
	public static void main(String[] args) {
		Man man1 = new Man();
		
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.children = 3;
		
		System.out.println(man1.age);
		System.out.println(man1.name);
		System.out.println(man1.isMarried);
		System.out.println(man1.children);
		
		man1.show();
	}
}
