package JUpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TranscriptDB {

			
	    public static void retrieveCustomer(String fullName) throws SQLException {
	    	
	    	Connection conn = getConnection();

	        String sql ="select Name, Credits,Grade,GPA from Transcript where name = '"+fullName+"'";
	        System.out.println("sql :"+sql);
	        
	        //creating PreparedStatement object to execute query
	        PreparedStatement preStatement = conn.prepareStatement(sql);
	    
	        ResultSet result = preStatement.executeQuery();
	      
	        while(result.next()) {
	            System.out.println("Student Name: "+result.getString("Name")+"\n Credits: "+result.getString("Credits")+ "\n Grade : "+result.getString("Grade")+"\n"+"\n GPA: "+result.getDouble("GPA"));
	            System.out.println("");
	            System.out.println("--------------------------------");
	            System.out.println("");
	        }
	        
	        conn.close();

	      
	    }
	    
	    public static void insertNewCustomerDB(String Name, Integer Credits, String Grade, Double GPA) throws SQLException
	    {
	    	Connection conn = getConnection();

	        String sql ="insert into Transcript values(null,'"+Name+"',"+Credits+",'"+Grade+"',"+GPA+" )";
	        
	        System.out.println("sql :"+sql);
	        
//	          creating PreparedStatement object to execute query
	          PreparedStatement preStatement = conn.prepareStatement(sql);
	   
	          ResultSet result = preStatement.executeQuery();
	         
	   	 
	    }
	    public static Connection getConnection() throws SQLException
	    {
	    	//URL of Oracle database server
	        String url = "jdbc:oracle:thin:system/password@localhost"; 
	      
	        //properties for creating connection to Oracle database
	        Properties props = new Properties();
	        props.setProperty("user", "testuserDB");
	        props.setProperty("password", "password");
	      
	        //creating connection to Oracle database using JDBC
	        Connection conn = DriverManager.getConnection(url,props);
	        
	        return conn;
	    }
	
}

