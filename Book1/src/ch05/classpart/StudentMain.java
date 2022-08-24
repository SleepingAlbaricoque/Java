package ch05.classpart;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 생성 클래스 내 main()함수 추가하여 구동하기 p.144
 */
public class StudentMain {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName; 
	}
	
	
	public static void main(String[] args) {
		Student studentAhn = new Student ();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	
	
}
