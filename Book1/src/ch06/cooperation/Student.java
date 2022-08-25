package ch06.cooperation;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : 객체 간 협력 실습 p.175
 */
public class Student {
	public String studentName;
	public int grade;
	public int money;


	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
}
	public void takeTaxi(Taxi taxi) {
		taxi.take(3000);
		this.money -= 3000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
