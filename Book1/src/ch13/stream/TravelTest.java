package ch13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		
		List<TravelCustomer> tList = new ArrayList<>();
		tList.add(new TravelCustomer("이순신", 40, 100));
		tList.add(new TravelCustomer("김유신", 20, 100));
		tList.add(new TravelCustomer("홍길동", 13, 50));
		
		tList.stream().forEach(s -> System.out.println(s));
		
		// 총 여행 비용 합산값
		System.out.println(tList.stream().mapToInt(c -> c.getPrice()).sum());
		
		// 20세 이상 고객 명단
		tList.stream().filter(c -> c.getAge() >= 20).map(s -> s.getName()).sorted().forEach(s -> System.out.println(s));
	}
}
