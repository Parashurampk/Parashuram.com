package ReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteConfigFile {

	public static void main(String[] args) throws IOException {
		
		//Create an object of File Reader Class
		FileWriter fr=new FileWriter(System.getProperty("user.dir")+"\\src\\test\\java\\PropertiesFiles\\Config.properties");
	//	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\PropertiesFiles\\Config.properties");
		
		//Create an object of properties class
		Properties p= new Properties();
		
		// Use set property method to set property
		p.setProperty("Url", "www.qspiedr.com");
		p.store(fr,"Sample comments");
	}

}

















