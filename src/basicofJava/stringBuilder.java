package basicofJava;

public class stringBuilder {

	
	public static void main(String[] args) {
		
		StringBuilder sbl = new StringBuilder("Hello");
		
		System.out.println("StringBuilder : "+sbl);  //Hello
		
		sbl.append(" world");
		
		System.out.println("StringBuilder after append: "+sbl); //Hello world
		
		System.out.println("reverse:  "+sbl.reverse()); //dlrow olleH
	}
}
