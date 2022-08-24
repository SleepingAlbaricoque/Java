package ch05;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : 인스턴스 생성 후 출력
 */
public class OnlineStore {

	long number;
	String id;
	String date;
	String name;
	String productNum;
	String addr;
	
	public long getNumber() {
		return number;
	}
	
	public String getId() {
		return id;
		
	}
	
	public static void main(String[] args) {
		
		OnlineStore store1 = new OnlineStore();
		
		store1.number = 201803120001L;
		store1.id = "abc123";
		store1.date = "2018년 3월 12일";
		store1.name = "홍길순";
		store1.productNum = "PD0345-12";
		store1.addr = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(store1.getNumber());
		System.out.println(store1.getId());
		
		
	}
}
