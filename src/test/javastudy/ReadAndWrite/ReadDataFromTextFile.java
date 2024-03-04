package ReadAndWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\Selenium\\Test.txt");
		BufferedReader br = new BufferedReader(fr);

		boolean str;

		while (str = br.readLine() != null) {
			System.out.println(str);
		}
	}

}
