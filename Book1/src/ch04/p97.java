package ch04;

public class p97 {

	public static void main(String[] args) {
		
		int age = 60;
		int charge;
		
		if (age < 8) {
			
			charge = 1000;
			System.out.println("취학 전 아동입니다");
			
		}else if (age < 14) {
			
			charge = 2000;
			System.out.println("초등학생입니다");
			
		}else if (age < 20) {
			
			charge = 2500;
			System.out.println("청소년입니다");
			
		}else if (age >= 60) {
			
			charge = 0;
			System.out.println("경로우대입니다");
			System.out.println("입장료는 0원 입니다");
			
		}else {
			
			charge = 3000;
			System.out.println("성인입니다");
		}
		
		
	}
}
