package part9.interface_practice.list_as_a_method_parameter;

import java.util.ArrayList;
import java.util.List;

public class mainProgram {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("First");
		names.add("Second");
		names.add("Third");

		System.out.println(returnSize(names));
	}
	
	public static <T> int returnSize(List<T> list) {
		return list.size();
	}
}
