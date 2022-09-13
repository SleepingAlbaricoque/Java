package ch15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/* 날짜 : 2022.09.13
 * 이름 : 조수빈
 * 내용 : FileInputStream 실습
 */
public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
