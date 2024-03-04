package Generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlcommands {

	public static void main(String[] args) throws SQLException {

		// Create a connection
		Connection con = DriverManager.getConnection("jdbc://mysql://localhost:3306/mydb", "root", "root");

		// Create statement/Query
		Statement stmt = con.createStatement();

		String s = "INSERT INTO STUDENT VALUES(103,'SMITH')";

		// Execute statement/Query
		stmt.execute(s);
		
		//Close connection
		con.close();
		
		System.out.println("Query executed..........");
	}

}
