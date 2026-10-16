package JavaProgramsOOPS;

public class multilevelInheritance {
	
	
	public static void main(String[] args) {
		
		
		// creating object of 3rd child class
		//we can access A, B methods in C using extends -->multilevelInheritance
		
		multilevelInheritanceC obj = new multilevelInheritanceC();

		obj.project();
		obj.collage();
		obj.student();
	}

}
