package ReadAndWrite;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {
		
		//Create an object of File Reader Class
//		FileReader fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\PropertiesFiles\\Config.properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\PropertiesFiles\\Config.properties");
		
		//Create an object of properties class
		Properties p= new Properties();
		
		//load the file
//		p.load(fr);
		p.load(fis);
		
		//Use get property method to get property
		System.out.println(p.getProperty("website"));
		
	}

}

















