package ch15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/* 날짜 : 2022.09.13
 * 이름 : 조수빈
 * 내용 : FileOutputStream 생성 실습
 */
public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}
}
