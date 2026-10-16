package basicofJava;

public class Stringdemo {

	
	public static void main(String[] args) {
		
		
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "Automation";
		
		
		//length()
		System.out.println("length of string s1: "+ s1.length()); //return the length of string
		System.out.println("length of string s2: "+ s2.length());
		System.out.println("length of string s3: "+ s3.length());
		
		
		//charAt(i)
		System.out.println("char at index 3 in string: "+s1.charAt(3)); 	//l
		System.out.println("char at index 2 in string: "+s2.charAt(2));		//r
		System.out.println("char at index 5 in string: "+s3.charAt(5));		//a
		
		
		//concat
		String word = s1.concat(s2);
		
		System.out.println("concatination : "+ word);           		//concatination : HelloWorld
		System.out.println("concatination : "+ s1.concat(s2));  		//concatination : HelloWorld
		System.out.println("concatination : "+ s3.concat(" Testing"));	//concatination : AutomationTesting
		
		
		//toUpperCase()
		System.out.println("Uppercase : "+ s1.toUpperCase());  		//Uppercase : HELLO
		System.out.println("Uppercase : "+ s2.toUpperCase()); 		//Uppercase : WORLD
		System.out.println("Uppercase : "+ s3.toUpperCase()); 		//Uppercase : AUTOMATION
		
		
		//toLowerCase()
		System.out.println("Lowercase : "+ s1.toLowerCase());	//Lowercase : hello
		System.out.println("Lowercase : "+ s2.toLowerCase());	//Lowercase : world
		System.out.println("Lowercase : "+ s3.toLowerCase());	//Lowercase : automation

		
		//equals()
		String s4 = "World";
		
		System.out.println("are string equal : "+ s1.equals(s2)); //false
		System.out.println("are string equal : "+ s2.equals(s4)); //true
		
		
		//equalsIgnorCase()
		String s5 = "hello";
		
		System.out.println("are string equal Ignoring case : "+s1.equalsIgnoreCase(s2) );  //false
		System.out.println("are string equal Ignoring case : "+s1.equalsIgnoreCase(s5) );  //true
		
		
		//contains()
		String s6 = "Welcome to Automation Testing";
		
		System.out.println("Contains method : "+ s6.contains(s3)); 			 //true
		System.out.println("Contains method : "+ s6.contains("Testing")); 	//true
		System.out.println("Contains method : "+ s6.contains(s1)); 			//false
		
		
		//startsWith()
		System.out.println("Starts with method : "+ s1.startsWith("He")); //true
		System.out.println("Starts with method : "+ s1.startsWith("he")); //false
		
		
		//endsWith()
		System.out.println("Ends with method : "+ s1.endsWith("lo")); 		//true
		System.out.println("Ends with method : "+ s3.endsWith("tion"));		//true
		
		
		//indexOf()
		System.out.println("Index of  : "+ s1.indexOf('H'));  	//0
		System.out.println("Index of  : "+ s2.indexOf('d')); 	//4
		System.out.println("Index of  : "+ s3.indexOf('o'));	//3
		
		
		//lastIndexOf()
		System.out.println("Last Index of  : "+ s1.lastIndexOf('l'));	//3
		System.out.println("last Index of  : "+ s2.lastIndexOf('W'));	//0
		System.out.println("last Index of  : "+ s3.lastIndexOf('o'));	//8
		
		
		//substring(beginindex, endindex)---->beginindex- included / endindex - excluded
		System.out.println("substring  : "+ s1.substring(1));  //ello
		System.out.println("substring  : "+ s2.substring(0,3)); //wor  
		System.out.println("substring  : "+ s6.substring(11,21)); //Automation
		
		
		


		
		
	}
}
