package ch10.interfaceex;

/* 날짜 : 2022.09.02
 * 이름 : 조수빈
 * 내용 : 인터페이스 활용 연습
 */
public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
