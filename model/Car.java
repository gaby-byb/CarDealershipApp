package model;

public class Car {

		
	 	private int carID;
	    private String make;
	    private String model;
	    private int year;
	    private double price;
	    private String color;
	    private String status; // "Available" or "Sold"
	    
	    
	    
	    // No-argument constructor (explicitly defined)
	    public Car() {	
	    }
	    
	    public Car(int carID, String make, String model, int year, double price, String color, String status) {
	        this.carID = carID;
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.price = price;
	        this.color = color;
	        this.status = status;
	    }

	    //getters and setters
	    
		public int getCarID() {
			return carID;
		}
		public void setCarID(int carID) {
			this.carID = carID;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

	    // Constructor, getters, and setters

	    
}
