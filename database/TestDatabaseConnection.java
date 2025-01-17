package database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabaseConnection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try(Connection conn = databaseConnection.getConnection())
		{
			System.out.print("Connected to the database successfully!");
		} 
		catch (SQLException | IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
