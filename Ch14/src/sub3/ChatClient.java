package sub3;

import java.net.Socket;

/*
 * 날짜 : 2022.09.21
 * 이름 : 조수빈
 * 내용 : 채팅 프로그램 실습하기
 * 
 * 클라이언트, 서버 둘 다 계속 실행이 되고 있어야 실시간 소통 가능 => 병행 실행 가능하도록 스레드 각각 만들어 실행
 */

public class ChatClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9001);
			
			Thread t1 = new SenderThread(socket);
			Thread t2 = new ReceiverThread(socket);
			
			t1.start();
			t2.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
