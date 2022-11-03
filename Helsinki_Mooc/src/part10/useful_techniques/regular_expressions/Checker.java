package part10.useful_techniques.regular_expressions;

public class Checker {
	private static Checker instance = new Checker();
	private Checker() {}
	
	public static Checker getInstance() {
		return instance;
	}
	
	public boolean isDayofWeek(String string) {
		String condition = "(mon|tue|wed|thu|fri|sat|sun)";
		
		if(string.toLowerCase().substring(0,3).matches(condition))
			return true;
		
		return false;
	}
	
	public boolean allVowels(String string) {
		String condition = "[aeiou]+";
		
		if(string.toLowerCase().matches(condition))
			return true;
		
		return false;
	}
	
	public boolean timeOfDay(String string) {
		String condition = "([01]\\d|2[0123]):([012345]\\d):([012345]\\d)";
		/*  [01]: any number among 0 and 1
		 *  \\d : any digit
		 *  | : or
		 *  2[0123] : any number among 0, 1, 2, 3 can follow the number 2 in the front   
		 */
		if(string.matches(condition))
			return true;
		
		return false;
	}
}
