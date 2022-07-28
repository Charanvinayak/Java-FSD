import java.util.*;



public class Collection {

	
	public static void main(String[] args) {
		
		System.out.println("Linked List");
		LinkedList<String> city = new LinkedList<>();
		city.add("chennai");
		city.add("Pune");
		System.out.println(city);
		System.out.println("arraylist");
		ArrayList<String> names = new ArrayList<>();
		names.add("peter");
		names.add("navin");
		System.out.println(names);
		System.out.println("\n");
		System.out.println("\n");
		LinkedList<Integer> num = new LinkedList<>();
		num.add(4);
		num.add(7);
		System.out.println(num);	
	    Vector<Integer> vec = new Vector<>();
	    vec.addElement(10);
	    vec.addElement(20);
	    System.out.println(vec);
	    
	}	
	
}
