package TestPackages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());  //toString it converts Obj to String format
	}

}
