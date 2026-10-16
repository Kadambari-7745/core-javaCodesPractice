package collaction;

import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
		TreeSet <Integer> trs = new TreeSet<>();
		
		trs.add(30);
		trs.add(40);
		trs.add(20);
		trs.add(10);
		trs.add(60);
		trs.add(30);  //duplicate will ignore
//		trs.add(null);   //throw exception --->java.lang.NullPointerException
		
		//print all element
		System.out.println(trs);  //[10, 20, 30, 40, 60]
		
		//remove
		trs.remove(40);
		System.out.println(trs);  //[10, 20, 30, 60]
		
		//1st element
		System.out.println(trs.getFirst()); //10
		
		//iteration
		for(Integer numbers: trs) {
			
			System.out.println(numbers);  //10, 20, 30, 60
		}	
		
	}

}
