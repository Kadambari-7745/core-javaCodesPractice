package collaction;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {
		
		public static void main(String[] args) {
			
			TreeMap<Integer, String> map = new TreeMap<>();
			
			map.put(1, "Apple");
			map.put(2, "Cherry");
			map.put(4, "Babana");
			map.put(3, "Mango");
			map.put(5, "Jamoon"); //maintain insertion order
			
//			map.put(null, "graps");  //throw error
			
			//print key- value
			System.out.println(map);//{1=Apple, 2=Cherry, 3=Mango, 4=Babana, 5=Jamoon}
			
			//accessing 
			System.out.println(map.get(4));  //Banana
			
			//remove 
			map.remove(3);
			System.out.println(map); //{1=Apple, 2=Cherry, 4=Babana, 5=Jamoon}
			
			System.out.println(map.containsKey(1)); //true
			
			System.out.println(map.containsValue("Jamoon")); //true
			
			//iteration
			for(Entry<Integer, String > fruit : map.entrySet()) {
				
				System.out.print(fruit.getKey()+" "+ fruit.getValue());
				//1 Apple2 Cherry4 Babana5 Jamoon
			}		
			
		}

	}

