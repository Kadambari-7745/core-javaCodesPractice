package collaction;

import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		
		LinkedList <String> list = new LinkedList<>();
		
		list.add("Cat");
		list.add("Dog");
		list.add("Cow");
		list.add("Monkey");
		list.add("Donkey");
		
		System.out.println(list); //[Cat, Dog, Cow, Monkey, Donkey]
		
		// add new tiger at 1
		list.add(0, "Tiger");
		System.out.println(list);   //Tiger, Cat, Dog, Cow, Monkey, Donkey
		
		//remove cow
		list.remove("Cow");
		System.out.println(list);   //[Tiger, Cat, Dog, Monkey, Donkey]
		
		//get last element
		System.out.println(list.getLast());  //Donkey
		
		// iteration 
		
		for(String animal : list) {
			
			System.out.println(animal); //Tiger, Cat, Dog, Monkey, Donkey
		}
	}

}
