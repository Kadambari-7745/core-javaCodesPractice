package NehaCodes;

public class accessSpecifierPrivate {
	
	
	private void display() {
		
		System.out.println("This is private display method");
	}
	
	
	public static void main(String[] args) {
		
		accessSpecifierPrivate obj = new accessSpecifierPrivate();
		obj.display();   //private display accessible only within the accessSpecifierPrivate class
		
	}

}



class demo{
	
	//here is not accessible the private method
	
}