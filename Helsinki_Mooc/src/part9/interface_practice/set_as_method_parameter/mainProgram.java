package part9.interface_practice.set_as_method_parameter;

import java.util.HashSet;
import java.util.Set;

public class mainProgram {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("first");
		names.add("first");
		names.add("second");
		names.add("second");
		names.add("second");

		System.out.println(returnSize(names));
	}
	
	public static <T> int returnSize(Set<T> set) {
		return set.size();
	}
}
