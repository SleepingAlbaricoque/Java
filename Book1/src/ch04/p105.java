package ch04;

/*
 * switch-case 문에서 case 값에 문자열 사용가능
 */

public class p105 {
	
	public static void main(String[] args) {
		
		String medalColor = "금";
		
		switch (medalColor) {
			case "Gold" : 
				System.out.println("금메달입니다");
				break;
			case "Silver" :
				System.out.println("은메달입니다");
				break;
			case "Bronze" :
				System.out.println("동메달입니다");
				break;
			default :
				System.out.println("참가상입니다");
		}
	}

}
