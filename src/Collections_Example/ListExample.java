package Collections_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class ListExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Arnel");
		names.add("Bianca");
		names.add("Jame");
		names.add("Ivy");
		names.add("Camilla");
		names.add("Anna");
		System.out.println(names);
		System.out.println("Total names are: "+names.size());
		names.remove(5);
		System.out.println(names);
		System.out.println("Total names are: "+names.size());
		
		System.out.println("Update Ivy");
		names.set(3, "Ivy Joy");
		System.out.println(names);
		
		if (names.contains("Anna")) {
			System.out.println("Anna is still present in the list.");
		}
		else {
			System.out.println("Anna is not present in the list.");
		}
		
		Collections.sort(names);
		System.out.println("After sorting the names.\n"+names);
		for (String name: names) {
			System.out.println(name);
		}
		names.add("Jame");
		System.out.println(names);
	}
}
