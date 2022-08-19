package ch04;

/*
 * switch-case문 연습
 * 
 */
public class p106 {

	public static void main(String[] args) {
		
		int floor = 5;
		
		switch (floor ) {
		case 1 : 
			System.out.println(floor + "층 약국입니다");
			break;
		case 2 : 
			System.out.println(floor + "층 정형외과입니다");
			break;
		case 3 : 
			System.out.println(floor + "층 피부과입니다");
			break;
		case 4 : 
			System.out.println(floor + "층 치과입니다");
			break;
		case 5 : 
			System.out.println(floor + "층 헬스 클럽입니다");
			break;
		}
	}
}
