package copy_code;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 내용 : 잔액 조회, 입출금, 송금이 가능한 뱅킹앱 만들기
 * 출처 : https://www.youtube.com/watch?v=wQbEH4tVMJA
 * 
 */

import java.util.Scanner;

public class Simple_Banking_App {

public static void main(String[] args) {
		
		
		BankAccount obj1 = new BankAccount("XYZ", "BA001");
		obj1.showMenu();
	}
}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		
		customerName = cname;
		customerId = cid;
	
	}
	
	void deposit(int amount)
	{
		if(amount != 0 && amount >0) {
			balance += amount;
			previousTransaction = amount;
		}
	}
	
	
	void withdraw(int amount)
	{
		//추가적으로 balance 보다 amount가 적은지 검증할 if문 추가
		//do-while문으로 바꿀 수는 없는 지 고민해보기
		
		if(balance >= amount) {
			
			if(amount != 0 && amount >0) {
				balance -= amount;
				previousTransaction = -amount;
				
		}	else {
			
			System.out.println("The amount of withdrawl should be above 0.");
		}	
		}else {
			
			System.out.println("Insufficient Balance on Withdrawl");
	}
	}
	void getPreviousTransaction() {
		
		if(previousTransaction > 0) {
			
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			
			System.out.println("Withdrawn: " +Math.abs(previousTransaction));
		}
		else {
			
			System.out.println("no transaction occured");
		}
		
		
	}
	
	void showMenu( ) {
		
		char option = '\0';
			//이것도 초기화인가? 왜 필요한지?
			//이거 안하고 while 안에 option 넣으면 option 변수로 쓸 수 없다고 오류남
			//do문 안에 넣어도 오류남
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			
			System.out.println("==========");
			System.out.println("Enter an option");
			System.out.println("==========");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("--------");
				System.out.println("Balance =" +balance);
				System.out.println("--------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("--------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("--------");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("--------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("--------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("--------");
				getPreviousTransaction();
				System.out.println("--------");
				System.out.println("\n");
				break;
			
			case 'E':
				System.out.println("******");
				break;
				
			default:
				System.out.println("Invalid Option. Please enter again.");
			}
			
		}while (option != 'E');
		
		System.out.println("Thank you for using our services.");
	}
}
