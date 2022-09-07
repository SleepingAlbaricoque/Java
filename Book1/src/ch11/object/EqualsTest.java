package ch11.object;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : equals() 메서드 사용 실습
 */
class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}
	
	public boolean equals(Object obj) { //The overriding method has the same name, number and type of parameters
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) // 물리적 동일성
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다");
		
		if(studentLee.equals(studentLee2)) // 논리적 동일성
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다");
		
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다");
		
		if(studentLee.equals(studentSang)) 
			System.out.println("studentLee와 studentSang은 동일합니다");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다");
		
		System.out.println("studentLee의 hashCode: " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode: " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값: " + System.identityHashCode(studentSang));
		
	}
}
