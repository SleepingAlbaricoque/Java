package part10.collections_as_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
	public static List<Integer> positive(List<Integer> numbers){
		ArrayList<Integer> posNums = (ArrayList<Integer>) numbers.stream()
									.filter(i -> i >0)
									.collect(Collectors.toList());
		
		return posNums;
	}
}
