package qa.com.javaintermediate.classes;

public class Car {
	private String colour;
    private String model;
    private String mileage;

    // constructor
    public Car(String colour, String model, String mileage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
    }

    // getters and setters for colour and model

    // getter for mileage
    public String getMileage() {
        return mileage;
    }

    // setter for mileage
    public void setMileage(String string) {
        this.mileage = string;
    }

    // functionality
    public void drive(int milesDriven) {
        this.setMileage(this.getMileage() + milesDriven);
    }

}
