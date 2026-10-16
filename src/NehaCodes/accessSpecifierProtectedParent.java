package NehaCodes;

public class accessSpecifierProtectedParent {
	
	
	protected void display() {
		
		System.out.println("This is protected display method");
	}
	
	public static void main(String[] args) {
		
		accessSpecifierProtectedParent obj = new accessSpecifierProtectedParent();
		obj.display();  // display method is accessible in within the class and same package
		
	}

}
