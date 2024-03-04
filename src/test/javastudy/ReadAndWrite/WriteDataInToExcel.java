package ReadAndWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInToExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet();

		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("RCV Academy");
		
		File f=new File(System.getProperty("user.dir") + "\\src\\test\\java\\PropertiesFiles\\TestData.xls");
		FileOutputStream fos= new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("File is written successfully!");
	}

}

