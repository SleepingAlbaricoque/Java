package ch15.stream.others;

import java.io.Console;

/* 날짜 : 2022.09.13
 * 이름 : 조수빈
 * 내용 : Console 클래스 실습
 */
public class ConsoleTest {
	public static void main(String[] args) {
		Console cs = System.console();
		
		System.out.println("이름: ");
		String name = cs.readLine();
		System.out.println("직업: ");
		String job = cs.readLine();
		System.out.println("비밀번호: ");
		char[] pass = cs.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
