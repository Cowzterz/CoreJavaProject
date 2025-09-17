package Collections_Example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(45);
		numbers.add(32);
		numbers.add(21);
		numbers.add(40);
		
		System.out.println(numbers);
		
		// add number 21 again
		// Set does not allow any duplicates
		// Set will not maintain insertion order
		numbers.add(21);
		System.out.println(numbers);
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
