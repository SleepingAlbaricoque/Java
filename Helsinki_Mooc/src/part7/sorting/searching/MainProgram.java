package part7.sorting.searching;

import java.util.Arrays;

/* 날짜 : 2022.10.06
 * 이름 : 조수빈
 * 내용 : selection sort 실습하기
 */
public class MainProgram {
	public static int smallest(int[] array) {
		int a = array[0];
		for(int i = 0; i < array.length; i++) {
				if(a > array[i])
					a = array[i];
		}
		return a;
	}
	
	public static int indexOfSmallest(int[] array) {
		int b = 0;
		for(int i =0; i < array.length; i++) {
			if(array[i] == MainProgram.smallest(array))
				b = i;
		}
		return b;
	}
	
	public static int indexOfSmallestFrom(int[] table, int startIndex) {
		int c = table[startIndex];
		int index = 0;
		for(int i = startIndex; i < table.length; i++) {
			if(c >= table[i]) {
				c = table[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void swap(int[] array, int index1, int index2) {
		int d = array[index1];
		array[index1] = array[index2];
		array[index2] = d;
	}
	
	public static void sort(int[] array) {
		for(int i =0; i < array.length; i++) {
			System.out.println(Arrays.toString(array));
			swap(array, i, indexOfSmallestFrom(array, i));
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {8, 3, 7, 9, 1, 2, 4};
		MainProgram.sort(numbers);
	}
}
