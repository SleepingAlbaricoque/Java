package ch07;

/* 날짜 : 2022.08.22
 * 이름 : 조수빈
 * 내용 : 배열 길이만큼 출력하기
 */
public class p204 {

	public static void main(String[] args) {
		
		double [] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i < data.length; i++ ) {
			System.out.println(data[i]);
		}
	}
}
