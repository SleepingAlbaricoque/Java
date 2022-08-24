package ch05.classpart;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 외부에 테스트용 클래스를 생성하기 p.146
 */
public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student ();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
