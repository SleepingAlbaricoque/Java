package ch15.stream.inputstream;

import java.io.IOException;

/* 날짜 : 2022.09.13
 * 이름 : 조수빈
 * 내용 : System.in으로 화면에서 문자 입력받기
 */
public class SystemInTest1 {
	public static void main(String[] args) throws IOException{
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
