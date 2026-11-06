import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Grafo {

	public static void main(String[] args) { 

		Queue<String> mangoSellers = new LinkedList<>();
		
		Queue<String> researchList = new LinkedList<>();
		researchList.add("Alice");
		researchList.add("Bob");
		researchList.add("Claire");
		researchList.add("Tom");
		
		while (!researchList.isEmpty()){
			
			String person = researchList.poll();
			
			if (isSeller(person)) {
				mangoSellers.add(person);
			}
			
		}
		
		System.out.println(mangoSellers);
	};
	
	public static Boolean isSeller(String people) {
		return people.endsWith("m");
	}
}
