package ReadAndWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTxtAndCSV {

	public static void main(String[] args) throws IOException {

		// Create an object of FileWriter Class
		FileWriter fr = new FileWriter(
				System.getProperty("user.dir") + "\\src\\test\\java\\PropertiesFiles\\TestData.csv",true);

		BufferedWriter br = new BufferedWriter(fr);
		br.write("RCV Academy Online"+",");
		
		System.out.println("Written sucessfully");

		br.close();
	}

}
