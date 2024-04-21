package ReadAndWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {

        // Specify the file path
        String filePath = "D:\\Eclipse Workplace\\Parashuram.com\\src\\test\\javastudy\\PropertiesFiles\\TestData.txt";

        // Create a FileReader to read the file
        FileReader fr = new FileReader(filePath);

        // Create a BufferedReader to efficiently read the characters
        BufferedReader br = new BufferedReader(fr);

        // Declare a variable to store each line read from the file
        String line;

        // Read each line from the file until the end of the file is reached
        while ((line = br.readLine()) != null) {
            // Print each line to the console
            System.out.println(line);
        }

        // Close the BufferedReader to release system resources
        br.close();
    }
}
