package basicofJava;

public class thisKeyword {

		String name = "Kadambari";

		public static void main(String[] args) {
			
			thisKeyword obj1 = new thisKeyword();
			obj1.method1();
			obj1.method2();
			obj1.method3();
											
		}	
		
		public void method1() {
			
			String name= "Dharkar";
			
			System.out.println(name);    				// o/p= Dharkar  
			System.out.println(this.name);  			// o/p= Kadambari  // global variable and non static can access by this. in non static method
			
			System.out.println("This is method1");
 			this.method2();
			this.method3();
					
		}
		 
		public void method2() {
			
			System.out.println("This is method2");
			
		}
		
		public void method3() {
			
			System.out.println("This is method3");
			
		}	

}
