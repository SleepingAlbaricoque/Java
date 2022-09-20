package sub3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sub2.Person;

/* 날짜 : 2022.09.20
 * 이름 : 조수빈
 * 내용 : 매핑 스트림 실습하기
 */
public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("김유신", 25));
		list.add(new Person("김춘추", 23));
		list.add(new Person("장보고", 35));
		list.add(new Person("강감찬", 45));
		list.add(new Person("이순신", 55));
		
		// map 
		list.stream().map(p -> p.getName().substring(1)).forEach(name -> System.out.print(name + " "));
		System.out.println();
		
		// flatMap
		List<String> names = Arrays.asList("김유신,김춘추", "장보고,강감찬", "이순신,정약용");
		names.stream().flatMap(name -> Arrays.stream(name.split(","))).forEach(name -> System.out.print(name + " "));
		System.out.println();
		
		// 외부 반복자 처리; 스트림은 내부 반복자; 대량의 데이터 다룰 때 성능(ex. 출력 속도) 향상 시키고자 스트림 사용
		System.out.println(names);
		
		for (String name : names) {
			String[] values = name.split(",");
			
			for(String value : values) {
				System.out.print(value + " ");
			}
		}
	}
}
