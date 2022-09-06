package ch14.exception;

/* 날짜 : 2022.09.06
 * 이름 : 조수빈
 * 내용 : autocloseable 인터페이스 직접 구현한 클래스 생성
 */
public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}

}
