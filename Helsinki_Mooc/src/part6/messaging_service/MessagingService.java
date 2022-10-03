package part6.messaging_service;

import java.util.ArrayList;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : ArrayList를 멤버 변수로 가지는 클래스 실습하기
 */
public class MessagingService {
	private ArrayList<Message> list;
	
	public MessagingService() {
		new ArrayList<>();
	}
	
	public void add(Message message) {
		if(message.getContent().length() <= 280) {
			this.list.add(message);
		}
	}
	
	public ArrayList<Message> getMessage(){
		return list;
	}
}
