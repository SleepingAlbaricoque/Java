package ch13.stream;

import java.util.Arrays;

/* 날짜 : 2022.09.20
 * 이름 : 조수빈
 * 내용 : 정수 배열에서 스트림 활용
 */
public class IntArrayTest {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
	}
}
