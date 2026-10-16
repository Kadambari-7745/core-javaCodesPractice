package basicofJava;



import NehaCodes.accessSpecifierProtectedParent;





public class accessSpecifierProtectedchild extends accessSpecifierProtectedParent {
	
public static void main(String[] args) {
		
	 // object created of accessSpecifierProtectedchild class
	
		accessSpecifierProtectedchild obj = new accessSpecifierProtectedchild(); 
		
		obj.display(); // display method accessible in different class of same package
		
	}
	

}
