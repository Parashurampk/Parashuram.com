package ReadAndWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataTxtAndCSV {

	public static void main(String[] args) throws IOException {

	// Create an object of FileWriter Class
		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\java\\PropertiesFiles\\TestData.csv");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println("Read sucessfully");

		br.close();
	}

}
