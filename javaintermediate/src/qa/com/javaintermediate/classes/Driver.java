package qa.com.javaintermediate.classes;

public class Driver extends Car{
	private String driverName;
	
	public Driver(String colour, String model, String mileage, String driverName) {
		super(colour, model, mileage);
		
	}

	

    // functionality
    public void drive(String milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }



	public String getDriverName() {
		return driverName;
	}



	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
}


