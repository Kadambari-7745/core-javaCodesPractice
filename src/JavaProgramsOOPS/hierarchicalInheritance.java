package JavaProgramsOOPS;

public class hierarchicalInheritance {
	
	public static void main(String[] args) {
		
		//creating object of 1st child class B 
		hierarchicalInheritanceB obj1 = new hierarchicalInheritanceB();
		
		obj1.developer();
		obj1.task();
		
		//creating object of 2st child class C
		hierarchicalInheritanceC obj2 = new hierarchicalInheritanceC();
		obj2.tester();
		obj2.task();
		
		//creating object of 3st child class D
		hierarchicalInheritanceD obj3 = new hierarchicalInheritanceD();
		obj3.devops();
		obj3.task();
		
	}

}
