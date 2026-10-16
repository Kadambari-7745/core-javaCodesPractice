package JavaProgramsOOPS;

public class override {
	
	public static void main(String[] args) {
		
		overrideAnimal obj1 = new overrideCat();
		overrideAnimal obj2 = new overrideDogs();
		obj1.sound(); //cats are eating
		obj2.sound(); //dogs are sleeping
		
		
		
	}

}
