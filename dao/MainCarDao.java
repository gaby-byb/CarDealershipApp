package dao;

import java.util.List;

import model.Car;

public class MainCarDao {

	public static void main(String[] args) {
		CarDao carDAO = new CarDao();
		
		
		List<Car> cars = carDAO.getAllCars();
		
		for(Car car : cars) {
			System.out.println("ID: " + car.getCarID() +
                    ", Make: " + car.getMake() +
                    ", Model: " + car.getModel() +
                    ", Year: " + car.getYear() +
                    ", Price: " + car.getPrice() +
                    ", Color: " + car.getColor() +
                    ", Status: " + car.getStatus());
		}
	}

}
