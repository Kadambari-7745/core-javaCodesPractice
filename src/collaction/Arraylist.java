package collaction;

import java.util.ArrayList;

public class Arraylist {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<> ();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		list.add("Mango");
		// print elements of arraylist
		System.out.println("fruits in Arraylist: "+ list);// [Apple, Banana, Kiwi, Mango]
		
		//print element using index
		System.out.println("fruit at index 1: "+ list.get(1)); //Banana
		
		//add "cherry" at index 4
		list.add(4, "cherry");
		System.out.println(list); //[Apple, Banana, Kiwi, Mango, cherry]
		
		//modify element
		list.set(0, "Strawberry");
		System.out.println(list);   //Strawberry, Banana, Kiwi, Mango, cherry]
		
		//remove element
		list.remove("Banana");
		System.out.println(list);   //[Strawberry, Kiwi, Mango, cherry]
		
		list.removeLast();
		System.out.println(list);   //Strawberry, Kiwi, Mango
		
		//iteration
		for(String  fruit : list ) {
			
			System.out.print(fruit);   //Strawberry, Kiwi, Mango, 
		}  
		
		
		
	}
	
	

}
