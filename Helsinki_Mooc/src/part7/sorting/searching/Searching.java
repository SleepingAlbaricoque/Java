package part7.sorting.searching;

import java.util.ArrayList;

/* 날짜 : 2022.10.09
 * 이름 : 조수빈
 * 내용 : linear search와 binary search 실습하기
 */
public class Searching {
	public static int linearSearch(ArrayList<Book> books, int searchedId) {
		for(Book book: books) {
			if(book.getId() == searchedId)
				return books.indexOf(book);
		}
		return -1;
	}
	
	public static int binarySearch(ArrayList<Book> books, int searchedId) {
		int begin = 0;
		int end = books.size() -1;
		
		while(begin >= end) {
			int middle = (begin + end) /2;
			if(books.get(middle).getId() == searchedId)
				return books.get(middle).getId();
			if(books.get(middle).getId() < searchedId)
				begin = middle + 1;
			if(books.get(middle).getId() > searchedId)
				begin = middle - 1;
		}
		return -1;
	}
	
	// recursive
	/* int binarySearch(int arr[], int l, int r, int x){
	 * 		if(r >= l) {
	 * 			int mid = l + (r - 1) /2;
	 * 
	 * 		if(arr[mid] == x)
	 * 			return mid;
	 * 
	 * 		if(arr[mid] > x)
	 * 			return binarySearch(arr, l, mid -1, x);
	 * 
	 * 		if(arr[mid] < x)
	 * 			return binarySearch(arr, mid +1, r, x);
	 * 		}
	 * 	return 1;
	 * }
	 */
}
