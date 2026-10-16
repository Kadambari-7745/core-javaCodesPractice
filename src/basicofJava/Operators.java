package basicofJava;

public class Operators {
	
	
	public static void main(String[] args) {
		
		// Arithmetic Operators
		
		int a = 16, b = 8;
		
		System.out.println("Addition: " + (a + b));
		
		System.out.println("Modulus: " + (a % b));
		
		
		// Assignment Operators
		
		int x = 10;
		
		x += 5; 
		
		System.out.println("x = " + x);
		
		
		// Relational Operators
		
		boolean result = (a > b);
		
		System.out.println("Is a > b? " + result);
		
		
		// Logical Operators
		
		boolean condition = (a > 10) && (b < 5);
		
		System.out.println("Logical Condition: " + condition);
	}

}
