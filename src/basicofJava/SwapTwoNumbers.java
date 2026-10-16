package basicofJava;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a= 15;
		int b= 20;
		
	 	System.out.println("value of a before swap: "+a);
		System.out.println("value of b before swap: "+b);
		
//		without using 3rd variable
		a= a+ b; 
		b= a-b;
		a= a-b;	
		
//		using 3rd variable	
		int temp;
		
		temp= a;
		a= b;
		b= temp;
				
		System.out.println("value of a after swap: "+a);
		System.out.println("value of b after swap: "+b);
		
	}

} 
