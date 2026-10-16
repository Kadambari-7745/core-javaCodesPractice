package collaction;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashmap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		map.put(10, "Audi");
		map.put(20, "BMW");
		map.put(40, "Alto");
		map.put(30, "Ferrari");
		map.put(50, "Jeep");
		map.put(null, "Thar");  //maintain insertion order
		
		//print key- value
		System.out.println(map);//{10=Audi, 20=BMW, 40=Alto, 30=Ferrari, 50=Jeep, null=Thar}
		
		//accessing 
		System.out.println(map.get(40));  //Alto
		
		//remove 
		map.remove(30);
		System.out.println(map); //{10=Audi, 20=BMW, 40=Alto, 50=Jeep, null=Thar}
		
		System.out.println(map.containsKey(10)); //true
		
		System.out.println(map.containsValue("BMW")); //true
		
		//iteration
		for(Entry<Integer, String > entry : map.entrySet()) {
			
			System.out.print(entry.getKey()+" "+ entry.getValue());
			//10 Audi20 BMW40 Alto50 Jeepnull Thar
		}		
		
	}

}
