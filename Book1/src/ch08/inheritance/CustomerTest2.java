package ch08.inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		VIPCustomer customerKim = new VIPCustomer(111, "김유신", 1);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
