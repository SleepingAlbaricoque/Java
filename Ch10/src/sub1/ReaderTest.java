package sub1;

import java.io.FileReader;

/* 날짜 : 2022.09.13
 * 이름 : 조수빈
 * 내용 : 문자 스트림 실습하기
 */
public class ReaderTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\java1\\Desktop\\sample1.txt";
			
			try {
				FileReader fr = new FileReader(path);
				
				
				while(true) {
					
					int value = fr.read();
					
					if(value == -1) { 	// 파일을 모두 읽었으면 이라는 뜻
						break;
					}
					
					char c = (char) value; // int와 char은 상호 캐스팅 가능
					System.out.print(c); // FileOutputStream 안쓰고 화면에 바로 출력할 때는 라인 30, 31처럼 하면 됨
					
					
					}
				
					// 스트림 해제
					fr.close();
				
				} 
			
			catch (Exception e) {
					e.printStackTrace();
			}
	  }
}
			

