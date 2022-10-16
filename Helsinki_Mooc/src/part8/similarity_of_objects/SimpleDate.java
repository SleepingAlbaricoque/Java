package part8.similarity_of_objects;


/* 날짜 : 2022.10.16
 * 이름 : 조수빈
 * 내용 : equals, hashCode 메서드 실습하기
 */
public class SimpleDate {
	private int year;
	private int month;
	private int day;
	
	public SimpleDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean equals(Object object) {
		if(this == object)
			return true;
		
		if(!(object instanceof SimpleDate))
			return false;
		
		SimpleDate comparing = (SimpleDate) object;
		if(this.year == comparing.year &&
		   this.month == comparing.month &&
		   this.day == comparing.day)
			return true;
		
		return false;
	}
	
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + year;
		hash = 31 * hash + month;
		hash = 31 * hash + day;
		return hash;
	}
	
	public static void main(String[] args) {
		SimpleDate d = new SimpleDate(1, 2, 2000);
		System.out.println(d.equals("heh"));
		System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
		System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
	}
}
