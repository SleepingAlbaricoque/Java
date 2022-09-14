package ch15.stream.others;

import java.io.File;
import java.io.IOException;

/* 날짜 : 2022.09.14
 * 이름 : 조수빈
 * 내용 : File 클래스 실습하기
 */
public class FileTest {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\user\\Desktop\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}
}
