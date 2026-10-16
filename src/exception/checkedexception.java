package exception;

import java.io.FileReader;
import java.io.IOException;

public class checkedexception {

	
	public static void main(String[] args) {
		
		FileReader fr;
		
		try {
			
			fr = new FileReader("text3.txt");
			System.out.println("file opened successfully");
			
		}catch(IOException e){
			
			System.out.println("exception caught: "+ e);
			
		}finally {
			
			System.out.println("program continue.....");
		}
		
		
		
	}
}
