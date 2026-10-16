package basicofJava;

public class GlobalVariable {
	
	static int num = 23;  // global variable 
	
	static int age1= 30;
	
	
	static int age;
	static char ch;    
	static double db;
	static String str;
	static float ft;
	static boolean flag;
	 
	public static void main(String[] args) {
		
		System.out.println("Global variable: "+num);
		
		System.out.println(age);   // will print default value of int
		System.out.println(ch);  // will print default value of char
		System.out.println(db); // will print default value of double
		System.out.println(str); // will print default value of  String
		System.out.println(flag); // will print default value of  boolean

		GlobalVariable obj = new GlobalVariable();
		obj.method1();
	} 

	public void method1() {
		
//		 static int age2 =18; //error
		System.out.println("method 1"+num);
	}
}
