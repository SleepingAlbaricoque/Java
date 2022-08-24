package ch05.classpart;

/*
 * 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 참조 변수와 참조 값 출력 p.150
 */
public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1); //해시 코드 값
		System.out.println(student2);
	}
}
