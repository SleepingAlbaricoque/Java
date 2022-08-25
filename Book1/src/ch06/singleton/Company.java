package ch06.singleton;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : singleton 패턴 연습
 */
public class Company {
	private static Company instance = new Company();
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
