package ch05.hiding;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : private 변수 테스트하기 p.163
 */
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//stduentLee.studentName = "이상원";
		//studentName 스트링은 private이라는 접근 제어자 때문에 Student 클래스 밖에서 수정 불가
		studentLee.setStudentName("이상원");
		
		 System.out.println(studentLee.getStudentName());
	}

}
