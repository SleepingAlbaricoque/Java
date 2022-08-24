package ch05;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 학생 클래스 만들기 p.129, p.132 p.141 p.142
 */
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public void showStudentInfo() {
		System.out.println(studentName + " ," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name; 
	}
}

