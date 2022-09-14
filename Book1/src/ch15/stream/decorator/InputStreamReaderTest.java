package ch15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 날짜 : 2022.09.14
 * 이름 : 조수빈
 * 내용 : 보조 스트림 InputStreamReader 실습하기
 */
public class InputStreamReaderTest {
	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}