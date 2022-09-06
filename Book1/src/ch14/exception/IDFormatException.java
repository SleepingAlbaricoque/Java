package ch14.exception;

/* 날짜 : 2022.09.06
 * 이름 : 조수빈
 * 내용 : 사용자 정의 예외 클래스 구현 실습
 */
public class IDFormatException extends Exception{
	public IDFormatException(String message) {
		super(message);
	}
}
