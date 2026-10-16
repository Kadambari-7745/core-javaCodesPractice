package collaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfileClass {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//create object of properties file
		Properties p = new Properties();
		
		//give the path of property file
		try (FileInputStream fis = new FileInputStream("src/collaction/Configuration.properties")){
			
			//to load the properties file
			p.load(fis);
			
			//read the properties
			String username = p.getProperty("Username");
			String Application = p.getProperty("Application");
			String Password = p.getProperty("Password");
			
			System.out.println("Read username from properties file: "+ username);
			System.out.println("Read Application name from properties file: "+ Application);
			System.out.println("Read Password from properties file: "+ Password);

		} catch(IOException e) {
			
			e.printStackTrace();// print the exception massage details
		}
	}

}
