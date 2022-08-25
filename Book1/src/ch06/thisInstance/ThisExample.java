package ch06.thisInstance;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : this 예약어 사용 p.170
 */
class Birthday {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}
