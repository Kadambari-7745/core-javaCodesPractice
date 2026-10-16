package basicofJava;

public class Static_class {
	
	public static void main(String[] args) {
		
		login();  		// calling static method by only method name 
		Static_class.dashboard();  		// or className.MethodName
		Class2.addToCart();
		System.out.println("age: "+Class2.age);
	}

public static void login() {
		
		System.out.println("url");
		System.out.println("login page");
		System.out.println("enter id & password");
		System.out.println("login successfull");
		System.out.println("***************");
	 	
	} 

public static void dashboard() {
	
	System.out.println("dashboard");
	System.out.println("search item");
	System.out.println("***************");
	}
}

class Class2{
	
	static int age =20;
	
public static void addToCart() {
	
	System.out.println("select item");
	System.out.println("add to cart");
	System.out.println("confirm order");	
	
}
	
}


