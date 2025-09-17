package Collections_Example;

import java.util.HashMap;
import java.util.Map;

public class PracticeExample {

	public static void main(String[] args) {
		String str = "Clean World Green World Happy World";
		Map<String, Integer> occurrence = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			if (occurrence.containsKey(word)) {
				int last = occurrence.get(word);
				occurrence.put(word, last + 1);
			} else {
				occurrence.put(word, 1);
			}
		}
		System.out.println(occurrence);
	}
}
