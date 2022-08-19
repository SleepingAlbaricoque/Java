package ch04;

public class p102 {

	public static void main(String[] args) {
		
		int rank =1;
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
					 break;
			case 2 : medalColor = 'S';
					 break;
			case 3 : medalColor = 'B';
					 break;
			default : medalColor = 'A';		 
		}
		
		System.out.println("메달 컬러는 " + medalColor + " 입니다");
	}
}
