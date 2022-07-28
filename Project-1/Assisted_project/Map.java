import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<String, Integer> player = new HashMap<>();
		player.put("Sachin", 100);
		player.put("Dhoni", 77);
		player.put("Virat", 18);
		System.out.println(player);
		System.out.println(player.get("Sachin"));
		
		
		player.replace("Sachin", 100, 200);
		System.out.println(player);
		
		System.out.println(player.containsKey("Raina"));
		
		player.putIfAbsent("Raina", 37);
		System.out.println(player);
	    player.remove("Virat");
	    System.out.println(player);
		
	}
	
	
}
