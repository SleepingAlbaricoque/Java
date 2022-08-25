package ch06.staticex;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : static 변수 사용 p.182
 */
public class Student {
	
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
