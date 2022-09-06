package ch14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 날짜 : 2022.09.06
 * 이름 : 조수빈
 * 내용 : 예외 처리 미루기 실습
 */
public class ThrowsException {
	public Class loadClass(String fileName, String className) throws
		FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) { // 위에 언급된 예외 이외 모든 예외 포괄; 반드시 맨 맽에 작성
			e.printStackTrace();
		}
	}
}
