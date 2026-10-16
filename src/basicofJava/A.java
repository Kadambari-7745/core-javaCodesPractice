package basicofJava;

public class A {
	
	
	public static void main(String[] args) {
		
		A obj1 = new A();
		obj1.method1();
		obj1.method2(); 
		
	 	B obj2 = new B();
		obj2.method3();
		obj2.method4();
		 
		C obj3 = new C();
		obj3.method5();
		obj3.method6();
		
		
	}
	
	
public void method1() {
		
		System.out.println("This is method1 of class A");
		
	}
	
	public void method2() {
		
		System.out.println("This is method2 of class A");
		
	}

}
