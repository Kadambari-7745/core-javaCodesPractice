
package collaction;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Pink");
		set.add("Blue");
		set.add("Yellow");
		set.add("Yellow"); //duplicate will ignore
		set.add("Black");
		set.add("Red");
		set.add(null);
		set.add(null); //only single null value allow
		
		//print all element
		System.out.println(set);  //[Red, null, Pink, Blue, Yellow, Black]
		
		//check available 
		System.out.println(set.contains("Blue"));  //true
		
		//remove element
		set.remove("Yellow");
		System.out.println(set);   //[Red, null, Pink, Blue, Black]
		
		//iteration of set
		for(String color: set) {
			
			System.out.println(color);    //Red, null, Pink, Blue, Black
		}
			
	}

}
