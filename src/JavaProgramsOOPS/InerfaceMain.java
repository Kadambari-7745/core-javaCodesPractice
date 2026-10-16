package JavaProgramsOOPS;

public class InerfaceMain {
	
	public static void main(String[] args) {
		
		InterfacePayments obj1 = new InterfaceCreditCard();
		
		InterfacePayments obj2 = new InterfaceUPI();
		
		obj1.pay(); //payment through credit card

		obj2.pay(); //payment through UPI

	}

}
