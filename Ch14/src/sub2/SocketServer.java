package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5002));
			
			while(true) {
				System.out.println("연결 대기");
				Socket socket = serverSocket.accept(); // 통신 요청 들어오면 클라이언트와 소통 위한 소켓 생성
				
				System.out.println("연결 수락");
				
				// 데이터 송신(Server -> Client)
				OutputStream os = socket.getOutputStream();
				String msg = "Hello Client!";
				
				byte[] msgBytes = msg.getBytes(); // OutputStream은 바이트 스트림이라 스트링을 바이트로 변환하는 것
				os.write(msgBytes);
				os.flush();
				System.out.println("데이터 송신 완료");
				
				// 데이터 수신(Client -> Server)
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readBytes = is.read(bytes);
				
				String result = new String(bytes, 0, readBytes, "UTF-8"); // 읽어들인 바이트를 다시 스트링으로 변환
				System.out.println(result);
				System.out.println("데이터 수신 완료");
				
				os.close();
				is.close();
				
				socket.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Server 종료");
	}
}

