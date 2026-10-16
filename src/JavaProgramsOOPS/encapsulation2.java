package JavaProgramsOOPS;

public class encapsulation2 {
	
	
	public static void main(String[] args) {
		
		//object created of encapsulation class
		Encapsulation e1= new Encapsulation();
		
		//setting the values to private variable
		e1.setName("Kadambari");
		e1.setAge(23);
		
		//print the value stored
		System.out.println(e1.getName()); //kadadmbari
		System.out.println(e1.getAge());  //23

	}

}
