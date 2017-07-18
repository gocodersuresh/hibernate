import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.DeleteDbFiles;
public class H2Sample {   
	public static final String DRIVER_CLASS = "org.h2.Driver";
	private static final String URL = "jdbc:h2:~/test";
	private static final String USER = "";
	private static final String PASS = "";

	public static Connection getConnection()
	{
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL,USER,PASS);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;

	}
	public void createTable() throws SQLException
	{
		Connection conn=H2Sample.getConnection();
		PreparedStatement stmt=null;
		
			stmt=conn.prepareStatement("create table Student(userName varchar(20),passWord varchar(10))");	
		
			stmt.execute();
			
		System.out.println("Table Created Successfully");
	}
	public void insertRecord() throws SQLException
	{
		Connection conn=H2Sample.getConnection();
		PreparedStatement stmt=null;
		
			stmt=conn.prepareStatement("Insert into Student values(?,?)");

			stmt.setString(1, "shivapreals");		
			stmt.setString(2, "shiva");
		
			stmt.execute();
			
			stmt.close();
			
			conn.close();
		System.out.println("Record Inserted Successfully");

	}    
public void displayRecord() throws SQLException
{
    Connection conn=H2Sample.getConnection();
    
    Statement stmt=conn.createStatement();
    
    ResultSet rs=stmt.executeQuery("Select * from Student");
    
    while(rs.next())
    {
    	System.out.println("User Name: "+rs.getString("userName")+ " Password "+rs.getString("passWord"));
    	
    }
    
    stmt.close();
	
	conn.close();

}

public void updateRecord() throws SQLException
{
	Connection conn=H2Sample.getConnection();
	PreparedStatement stmt=null;
	
		stmt=conn.prepareStatement("Update Student set userName=? where userName like ?");

		stmt.setString(1, "Updatedshivapreals");		
		stmt.setString(2, "shivapreals");
	
		stmt.execute();
		
		stmt.close();
		
		conn.close();
	System.out.println("Record Updated Successfully");

}    
	public static void main(String[] args) {

		try {
			H2Sample h2=new H2Sample();
			
			h2.createTable();//for the first time use this statement use this then comment it.
			h2.insertRecord();
			h2.updateRecord();
			h2.displayRecord();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
