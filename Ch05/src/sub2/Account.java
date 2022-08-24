package sub2;

/*
 * 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : Java 클래스 객체 실습하기
 * 
 * 클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고 속성(필드)와 기능(메서드)으로 구성
 * - 객체는 클래스의 실제 인스턴스(메모리 공간)이며 new 연산으로 생성
 */
public class Account {

	
	// 속성
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	// 생성자
	public Account (String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	// 기능
	public void deposit(int money ) {
		
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("----------------------------");
		System.out.println("은행명 : " +bank);
		System.out.println("계좌번호 : " +id);
		System.out.println("입금주 : " +name);
		System.out.println("현재잔액 : " +balance);
		System.out.println("----------------------------");
	}

	

}
