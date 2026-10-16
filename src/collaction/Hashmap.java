package collaction;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "Audi");
		map.put(20, "BMW");
		map.put(40, "Alto");
		map.put(30, "Ferrari");
		map.put(50, "Jeep");
		map.put(null, "Thar");  // null will always at 1st position
		
		//print key- value
		System.out.println(map);//{null=Thar, 50=Jeep, 20=BMW, 40=Alto, 10=Audi, 30=Ferrari}
		
		//accessing 
		System.out.println(map.get(40));  //Alto
		
		//remove 
		map.remove(20);
		System.out.println(map); //{null=Thar, 50=Jeep, 40=Alto, 10=Audi, 30=Ferrari}
		
		System.out.println(map.containsKey(10)); //true
		
		System.out.println(map.containsValue("BMW")); //False
		
		//iteration
		for(Entry<Integer, String > entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+ entry.getValue());
			
		}		
		
	}

}
