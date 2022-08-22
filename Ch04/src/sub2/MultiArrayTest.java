package sub2;

/*
 * 날짜 : 2022.08.22
 * 이름 : 조수빈
 * 내용 : Java 다차원 배열 실습하기
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		
		// 1차원 배열 (Linear)
		int []scores = {80, 60, 78, 62, 92}; //배열 변수 이름은 복수형으로 짓기
		int total = 0;
		
		for (int score : scores ) {
			
			total += score;
			
			
		}
		
		System.out.println("scores의 합 : " +total);
		
		// 2차원 배열 (Matrix)
		int arr2d[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}; //대괄호 위치는 변수 이름 앞뒤 둘 다 가능
							//각 중괄호는 행을 나타냄; 7은 1행 2열
							// int arr2d[][] = {{1, 2, 3, 4},
							//					{5, 6, 7, 8}
							// 					{9, 10, 11, 12}};
							// 1은 0행 0열
		
		System.out.println("arr2d[0][0] : " +arr2d[0][0]);
		System.out.println("arr2d[0][1] : " +arr2d[0][1]);
		System.out.println("arr2d[0][2] : " +arr2d[0][2]);
		System.out.println("arr2d[0][3] : " +arr2d[0][3]);

		System.out.println("arr2d[1][0] : " +arr2d[1][0]);
		System.out.println("arr2d[1][1] : " +arr2d[1][1]);
		System.out.println("arr2d[1][2] : " +arr2d[1][2]);
		System.out.println("arr2d[1][3] : " +arr2d[1][3]);
		
		System.out.println("arr2d[2][0] : " +arr2d[2][0]);
		System.out.println("arr2d[2][1] : " +arr2d[2][1]);
		System.out.println("arr2d[2][2] : " +arr2d[2][2]);
		System.out.println("arr2d[2][3] : " +arr2d[2][3]);
		
		for(int a =0; a<3; a++) {
			
			for(int b =0; b<4; b++ ) {
				
				System.out.println("arr2d["+a+"]["+b+"] : " + arr2d[a][b]);
			}
		}
		
		for(int a = 0; a<3; a++ ) {
			
			for (int b =0; b<4; b++ ) {
				
				System.out.print(arr2d[a][b]);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		// 3차원 배열
		int [][][] arr3d = {{{1, 2, 3}, 
							 {4, 5, 6}, 
							 {7, 8, 9}}, 
						   {{10, 11, 12}, 
							{13, 14, 15}, 
							{16, 17, 18}}, 
						   {{19, 20, 21}, 
							{22, 23, 24}, 
							{25, 26, 27}}}; //차례대로 면, 행, 열
				
		
		for (int d = 0; d<3; d++) {
			
			for (int e = 0; e<3; e++) {
				
				for(int f = 0; f<3; f++ ) {
					
					System.out.printf("arr3d[%d][%d][%d] : %d", d, e, f, arr3d[d][e][f]);
					System.out.print(" ");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
