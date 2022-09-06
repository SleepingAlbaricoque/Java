package ch14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 날짜 : 2022.09.06
 * 이름 : 조수빈
 * 내용 : 파일 입출력에서 발생하는 예외 처리하기
 */
public class ExceptionHandling1 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다");
	}
}
