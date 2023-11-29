package com.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class DBConnectoin {
	public static void main(String args[]) {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:testccwd/testccwd@172.26.196.23:1521:LLINKT");
//
			//String dbURL2 = "jdbc:oracle:thin:@//172.26.196.23:1521/LLINKT";
//			String dbURL2 = "jdbc:oracle:thin:@(				  DESCRIPTION=(ADDRESS_LIST =(ADDRESS=(PROTOCOL=TCP)(HOST=CCDK-03-SV-DB10.cc-dk.net)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=orcl.cc-dk.net)(SERVER=DEDICATED)))";
			/*
			 * String dbURL2 = "jdbc:oracle:thin:@(DESCRIPTION_LIST=(" +
			 * "DESCRIPTION =(ADDRESS=(PROTOCOL=TCP)" +
			 * "(HOST=CCDK-03-SV-DB10.CC-DK.net)(PORT = 1521)" +
			 * "(CONNECT_DATA=(SERVICE_NAME=LLDB12C)(SERVER=SHARED))" + ")" + ")";
			 */	
//			String dbURL2 = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)))(HOST=ccdk-03-sv-db10.cc-dk.net)(PORT=1521)"
//							+"(CONNECT_DATA=(SERVICE_NAME=lldb12c.cc-dk.net)))";
//			String dbURL2 = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP))(HOST=ccdk-03-sv-db10.cc-dk.net)(PORT=1521)"
//					+"(CONNECT_DATA=(SERVICE_NAME=lldb12c.cc-dk.net)))";
			
			String dbURL2 = "jdbc:oracle:thin://10.20.70.49:1521/lldb12c";
			String username = "ccwd";
//	         String password = "wvVrdJMf3rrW8qxpGLiUQnUgNP+X/iYFLlzt60IFOf0=";
			String password = "ccwd";
			Connection con = DriverManager.getConnection(dbURL2, username, password);

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from depot");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
