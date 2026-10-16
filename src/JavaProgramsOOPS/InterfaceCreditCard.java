package JavaProgramsOOPS;


// creditcard is implemets payment interface
public class InterfaceCreditCard  implements InterfacePayments{
	
	//abstract method pay --body
	public void pay() {
		
		System.out.println("payment through credit card");
	}
	
}
