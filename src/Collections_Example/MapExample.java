package Collections_Example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> delegates = new HashMap<>();
		delegates.put("CEO", "Camilla");
		delegates.put("COO", "Ivy");
		delegates.put("CFO", "Jame");
		delegates.put("CHO", "Ivy");
		System.out.println(delegates);
		
		delegates.remove("CHO");
		System.out.println(delegates);
		
		delegates.put("CEO", "Arnel");
		System.out.println(delegates);
		
		System.out.println(delegates.keySet()+"\n");
		
		System.out.println("CEO of the Company is "+delegates.get("CEO"));
		System.out.println("COO of the Company is "+delegates.get("COO"));
		System.out.println("CFO of the Company is "+delegates.get("CFO"));
		
		System.out.println("\nUsing foreach loop\n");
		for (String key : delegates.keySet()) {
			System.out.println(key +" of the Company is "+delegates.get(key));
		}
	}
}
