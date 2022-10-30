package part9.interface_practice.map_as_a_method_parameter;

import java.util.HashMap;
import java.util.Map;

public class mainProgram {
	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>();
		names.put("1", "first");
		names.put("2", "second");

		System.out.println(returnSize(names));
	}
	
	public static <K, V> int returnSize(Map<K, V> map) {
		return map.size();
	}
}
