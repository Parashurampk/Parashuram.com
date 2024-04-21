package ReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataInToExce {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File("D:\\Eclipse Workplace\\Parashuram.com\\src\\test\\javastudy\\PropertiesFiles\\TestData.xls");
		FileInputStream fos = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fos);
		Sheet sheet0 = wb.getSheetAt(0);

		Row row0 = sheet0.getRow(0);
		Cell cellc0 = row0.getCell(0);

		System.out.println(cellc0);
		fos.close();

	}

}
