package ch07.array;

/* 날짜 : 2022.08.27
 * 이름 : 조수빈
 * 내용 : 자료형이 같은 배열 복사하기
 */
public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i = 0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
