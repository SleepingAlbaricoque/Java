package part7.larger_programming_exercises.bigYear;

/* 날짜 : 2022.10.10
 * 이름 : 조수빈
 * 내용 : 새 관찰 일지 프로그램 만들기
 */
public class Bird {
	private String name;
	private String latin;
	private int count;
	
	public Bird(String name, String latin) {
		this.name = name;
		this.latin = latin;
		this.count = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLatin() {
		return latin;
	}
	
	public void setLatin(String latin) {
		this.latin = latin;
	}
	
	public void plusCount() {
		this.count++;
	}
	
	public String toString() {
		return name + "(" + latin + "): " + count + " observations";
	}
}
