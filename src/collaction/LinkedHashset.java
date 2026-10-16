package collaction;

import java.util.LinkedHashSet;

public class LinkedHashset {
	
	public static void main(String[] args) {
		
		LinkedHashSet <String> lsh = new LinkedHashSet <>();
		
		lsh.add("BMW");   //maintain insertion order
		lsh.add("Ferrari");
		lsh.add("Audi");
		lsh.add("Mercedes");
		lsh.add("BMW");    //IGNORE duplicate
		lsh.add(null);
		lsh.add(null);  //ignore 2nd null value
		
		//print all element
		System.out.println(lsh);   //[BMW, Ferrari, Audi, Mercedes, null]
		
		//check available
		System.out.println(lsh.contains("BMW")); //true
		
		//remove element
		lsh.remove("Audi");
		System.out.println(lsh);  //BMW, Ferrari, Mercedes, null
		
		//iteration
		for(String vehicle : lsh) {
			
			System.out.println(vehicle); //BMW, Ferrari, Mercedes, null
		}
		
	}

}
