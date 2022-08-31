package ch08.inheritance;

/* 날짜 : 2022.08.31
 * 이름 : 조수빈
 * 내용 : 가상 메서드 예제
 */
public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() + customerLee.calcPrice(price));
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + customerKim.calcPrice(price));
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + vc.calcPrice(price));
		
	}
}
