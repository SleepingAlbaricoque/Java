package ch02;

/* 날짜 : 2022.08.21
 * 이름 : 조수빈
 * 내용 : 묵시적 형 변환
 */
public class p65 {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
	}
}
