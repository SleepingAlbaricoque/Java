package ch14.exception;

import java.util.Scanner;

public class PasswordExceptionTest {
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호에는 숫자가 포함되어야 합니다");
		}
		else if(password.length() <= 5) {
			throw new PasswordException("비밀번호는 여섯 자리 이상이어야 합니다");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordExceptionTest test = new PasswordExceptionTest();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.nextLine();
		
		try {
			test.setPassword(password);
			return;
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
}
