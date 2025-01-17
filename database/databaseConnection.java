package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class databaseConnection {
	//using a file reader to keep login info safe
	//loads connection from a file
	private static final String PROPERTIES_FILE = "db.properties";
	public static Connection getConnection() throws SQLException, IOException 
	{
        Properties props = new Properties();
        //read data from the file created
        try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) 
        {
            props.load(fis);
        }
        String URL = props.getProperty("db.url");
        String user = props.getProperty("db.username");
        String password = props.getProperty("db.password");
        
        return DriverManager.getConnection(URL, user, password);
        

        
	}
}
