package ch15.stream.reader;

import java.io.FileReader;
import java.io.IOException;

/* 날짜 : 2022.09.13
 * 이름 : 조수빈
 * 내용 : FileReader로 읽기 실습
 */
public class FileReaderTest {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
