package collaction;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//create object of properties
		Properties p = new Properties();
		//setting values in file
		p.setProperty("Username", "Admin");
		p.setProperty("Password", "123456789");
		p.setProperty("Application", "YellowFashion");
		
		try {
			//writting output file
			FileOutputStream fot = new FileOutputStream("src/collaction/Configuration2.properties");
			
			//to save the output file
			p.store(fot, "Application Configuration"); //msg in properties file
			System.out.println("Properties file updated successfully ! ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	

}
