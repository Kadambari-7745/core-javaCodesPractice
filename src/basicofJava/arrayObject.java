package basicofJava;

public class arrayObject {
	
	public static void main(String[] args) {
		
		// using Object we can store multiple types of data into single array 
		Object[] arrObj = {10, 29.8, "Novel", 'K', "ABCD"};
		
		//print data using for loop
		for (int i = 0; i < arrObj.length; i++) {
	        System.out.println(arrObj[i]);
	    }
		
		//also we can print data using enhanced for loop
		for(Object a : arrObj) {
			
			System.out.println(a);
			
		}
	}

}
