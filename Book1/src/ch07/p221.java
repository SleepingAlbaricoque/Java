package ch07;

/* 날짜 : 2022.08.22
 * 이름 : 조수빈
 * 내용 : 이차원 배열의 길이 출력하기
 */
public class p221 {

	public static void main(String[] args) {
		
		int [][] arr = new int[2][3];
		
		for(int i =0; i < arr.length; i++) {
			
			for(int j =0; j < arr[i].length; j++) {
				
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr.length); //행 길이
		System.out.println(arr[0].length); //열 길이
	}
}
