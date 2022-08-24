package ch05.hiding;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : private 사용하기 p.161 p.164
 */
public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
