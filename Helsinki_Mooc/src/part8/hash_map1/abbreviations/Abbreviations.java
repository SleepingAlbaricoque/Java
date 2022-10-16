package part8.hash_map1.abbreviations;

import java.util.HashMap;

/* 날짜 : 2022.10.13
 * 이름 : 조수빈
 * 내용 : Hash Map 실습하기
 */
public class Abbreviations {
	HashMap<String, String> abbv;

	public Abbreviations() {
		this.abbv = new HashMap<>();
	}
	
	public void addAbbreviation(String abbreviation, String explanation) {
		abbv.put(abbreviation, explanation);
	}
	
	public boolean hasAbbreviation(String abbreviation) {
		if(abbv.containsKey(abbreviation))
			return true;
		
		return false;
	}
	
	public String findExplanationFor(String abbreviation) {
		return abbv.get(abbreviation);
	}
	
	public static void main(String[] args) {
		Abbreviations abbreviations = new Abbreviations();
		abbreviations.addAbbreviation("e.g.", "for example");
		abbreviations.addAbbreviation("etc.", "and so on");
		abbreviations.addAbbreviation("i.e.", "more precisely");
		
		String text = "e.g. i.e. etc. lol";
		
		for (String part : text.split(" ")) {
			if(abbreviations.hasAbbreviation(part))
				part = abbreviations.findExplanationFor(part);
		
		System.out.print(part);
		System.out.print(" ");
		}
		
		
	}
}
