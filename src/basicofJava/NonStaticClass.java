package basicofJava;

public class NonStaticClass {
	
	static String name1 ="Hello world";
	
	public static void main(String[] args) {
		
		NonStaticClass obj1 = new NonStaticClass();
		obj1.method1();
		obj1.method2();
		
		classB obj2 = new classB();
		obj2.method3();
		obj2.method4();
		
		System.out.println(NonStaticClass.name1); 								// accessing global variable of NonStaticClass
		
		System.out.println("age: "+ obj2.age);  
		
		System.out.println("Nmae: "+obj2.name);   								//accessing global variable of classB
	 }	
	  
	public void method1() {
		
		System.out.println("This is method1");
		
	}
	
	public void method2() {
		
		System.out.println("This is method2");
		
	}
}

class classB{
	
	String name ="Kadambari";  												//global variable of classB
	int age = 20; 
	
	public void method3() {
		
		System.out.println("This is method3");	
	
	}
	
	public void method4() {
		
		System.out.println("This is method4");
	
	}
}
