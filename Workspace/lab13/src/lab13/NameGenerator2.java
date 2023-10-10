package lab13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameGenerator2 {
	public static void main(String[] args) {
		String[] peoples = { "Bob", "Carol", "Ted", "Alice" };
		List<String> names = Arrays.asList(peoples);
		Collections.shuffle(names);
		for (String name : names) {
			System.out.print(name + " ");
		}
	}
}