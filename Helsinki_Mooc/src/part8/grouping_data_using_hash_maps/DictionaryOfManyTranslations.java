package part8.grouping_data_using_hash_maps;

import java.util.ArrayList;
import java.util.HashMap;

/* 날짜 : 2022.10.17
 * 이름 : 조수빈
 * 내용 : list를 값으로 가지는 hashMap 생성 실습하기 
 */
public class DictionaryOfManyTranslations {
	private HashMap<String, ArrayList<String>> dict;
	
	public DictionaryOfManyTranslations() {
		this.dict = new HashMap<>();
	}
	
	public void add(String word, String translation) {
		this.dict.putIfAbsent(word, new ArrayList<>());
		
		dict.get(word).add(translation);
	}
	
	public ArrayList<String> translate(String word) {
		if(!(dict.containsKey(word)) || dict.get(word).isEmpty() )
			return new ArrayList<>();
		
		return dict.get(word);
	}
	
	public void remove(String word) {
		if(dict.containsKey(word))
			dict.remove(word);
	}
	
	public static void main(String[] args) {
		DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
		dictionary.add("lie", "maata");
		dictionary.add("lie", "valehdella");

		dictionary.add("bow", "jousi");
		dictionary.add("bow", "kumartaa");

		System.out.println(dictionary.translate("lie"));
		dictionary.remove("bow");
		System.out.println(dictionary.translate("bow"));
	}
}
