package ch08.inheritance;

/* 날짜 : 2022.08.31
 * 이름 : 조수빈
 * 내용 : 메서드 오버라이딩 실습
 */
public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
	
		VIPCustomer customerKim = new VIPCustomer(10020, " 김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님의 지불 금액은" + customerLee.calcPrice(price) + "원 입니다.");
		System.out.println(customerKim.getCustomerName() + "님의 지불 금액은" + customerKim.calcPrice(price) + "원 입니다.");
	
	}
	
	
}
