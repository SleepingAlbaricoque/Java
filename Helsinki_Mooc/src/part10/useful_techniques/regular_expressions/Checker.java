package part10.useful_techniques.regular_expressions;

public class Checker {
	public boolean isDayofWeek(String string) {
		String condition = "(mon|tue|wed|thu|fri|sat|sun)";
		
		if(string.toLowerCase().substring(0,3).matches(condition))
			return true;
		
		return false;
	}
	
	public boolean allVowels(String string) {
		String condition = "a*e*i*o*u*";
		
		if(string.toLowerCase().matches(condition))
			return true;
		
		return false;
	}
}
