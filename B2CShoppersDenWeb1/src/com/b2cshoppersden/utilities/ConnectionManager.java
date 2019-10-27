package com.b2cshoppersden.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
public static  DataSource dataSource=new DataSource();

    private static Connection connection1=null;
    public static Connection openConnection1() {
        try {
        Class.forName(dataSource.getDriver());
        connection1=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
      //  return connection1;
        
    }catch(Exception e) {
    	System.out.println("Error");
    	e.printStackTrace();
    }
		return connection1;}
    
    public static void closeConnection1() throws SQLException{
        
        connection1.close();
    }

}
 






