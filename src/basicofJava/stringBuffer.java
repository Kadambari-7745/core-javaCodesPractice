package basicofJava;

public class stringBuffer {
	
	
	public static void main(String[] args) {
		
		
		StringBuffer stb = new StringBuffer("java");
		
		System.out.println("string buffer value : "+stb);  //java


		//append() method add text at the end of string
		stb.append(" Programming"); 
		
		System.out.println("string buffer afert append: "+stb); //java Programming
		
		//insert() add text at index 
		stb.insert(5, "Language ");
		
		System.out.println("string buffer after insert: "+stb); //java LanguageProgramming

		
		
	}

}
