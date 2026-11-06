import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Grafo {
	
	// You > Alice, Bob
	// Alice > Claire
	// Bob > 
	// Claire > Tom
	// Tom > You

	public static void main(String[] args) { 

		// Grafo representation
		Map<String, List<String>> nodes = new LinkedHashMap<>();
		nodes.put("You", new ArrayList<>(Arrays.asList("Alice", "Bob")));
		nodes.put("Alice", new ArrayList<>(Arrays.asList("Claire")));
		nodes.put("Bob", new ArrayList<>());
		nodes.put("Claire", new ArrayList<>(Arrays.asList("Tom")));
		nodes.put("Tom", new ArrayList<>());
		
		Queue<String> researchList = new LinkedList<>(nodes.get("You"));
		
		List<String> mangoSellers = new ArrayList<>();
		
		
		while (!researchList.isEmpty()){
			String person = researchList.poll();
			
			if (isSeller(person)) {
				mangoSellers.add(person);
			}
			
			else {
				researchList.addAll(nodes.get(person));
			}
		}
		
		System.out.println(mangoSellers);
	};
	
	public static Boolean isSeller(String people) {
		return people.endsWith("m");
	}
}
