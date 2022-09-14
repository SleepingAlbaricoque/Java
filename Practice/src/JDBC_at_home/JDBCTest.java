package JDBC_at_home;

import java.sql.Connection;
import java.sql.DriverManager;

/* 날짜 : 2022.09.14
 * 이름 : 조수빈
 * 내용 : JDBC 실습하기
 */
public class JDBCTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/?user=root";
		String user = "root";
		String pass = "!naranja0421";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속 테스트 완료");
	}
}
