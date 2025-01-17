package dao;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import database.databaseConnection;
import model.Car;

public class CarDao {
	
	
	//retrieves all cars from the car table in the database
	public List<Car> getAllCars() 
	{	
		//stores cars in a list
		List<Car> cars = new ArrayList<>();
		String sql = "SELECT * FROM car"; //SQL QUERY
		
		try (Connection conn  = databaseConnection.getConnection();//create connection
			 Statement stmt = conn.createStatement();// sending queries to the database
			 ResultSet rs = stmt.executeQuery(sql)) {
		
			//loop ResultSet and read data
			while(rs.next())
			{
				Car car = new Car();//new object
				// Set the properties of the Car object with data from the ResultSet
                car.setCarID(rs.getInt("CarID")); // Set the CarID from the CarID column in the ResultSet
                car.setMake(rs.getString("Make")); // Set the Make from the Make column
                car.setModel(rs.getString("Model")); // Set the Model from the Model column
                car.setYear(rs.getInt("Year")); // Set the Year from the Year column
                car.setPrice(rs.getDouble("Price")); // Set the Price from the Price column
                car.setColor(rs.getString("Color")); // Set the Color from the Color column
                car.setStatus(rs.getString("Status")); // Set the Status from the Status column
                
                cars.add(car); // Add the Car object to the list

				
			}
			
		} 
		
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//create connection
		return cars; //returns list

	}
	
	public void addCar(Car car) {
		//QUERY to insert new row with placeholder
		String sql = "INSERT INTO car (Make, Model, Year, Price, Color, Status) VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = databaseConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql))
		{
			// Set values for the placeholders in the SQL query using the Car object's properties
            stmt.setString(1, car.getMake()); 
            stmt.setString(2, car.getModel()); 
            stmt.setInt(3, car.getYear()); 
            stmt.setDouble(4, car.getPrice()); 
            stmt.setString(5, car.getColor()); 
            stmt.setString(6, car.getStatus()); 
            
            stmt.executeUpdate(); // Execute the SQL update, which inserts the new row into
		} 
		
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//create connection
	}
}
