package part6.simple_dictionary;

import java.util.HashMap;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : 깔끔한 유저 인터페이스 만들기
 */
public class SimpleDictionary {
	private HashMap<String, String> translations;
	
	public SimpleDictionary() {
		this.translations = new HashMap<>();
	}
	
	public String translate(String word) {
		return this.translations.get(word);
	}
	
	public void add(String word, String translation) {
		this.translations.put(word, translation);
	}
}
