package ch04;

/*
 * 날짜 : 2022.08.20
 * 내용 : for문을 사용하여 구구단 출력(3단 ~ 7단)
 */
public class p116 {

	public static void main(String[] args) {
		
		for (int i = 3; i >=3 && i <= 7; i++) {
			
			for (int j =1; j < 10; j++) {
				
				
					int l = i * j;
				
				System.out.println(i + " x " + j + " = " + i*j);
			
				
			}	
		}
	}
}
