package basicofJava;

public class LocalVariable {
	
	
	public static void main(String[] args) {
		
		String firstName = "Kadambari"; //local variable
		int age = 20;					//local variable
		System.out.println("Local variable: "+firstName);
		System.out.println("Local variable: "+age);
		
		LocalVariable obj = new LocalVariable();
		obj.method1();
	
	} 

	public void method1() {
		
		String lastName = "Dharkar"; //local variable
		int age1= 55;				//local variable
		System.out.println("Local variable of method1: "+lastName);
		System.out.println("Local variable of method1: "+age1);
	}

}
 