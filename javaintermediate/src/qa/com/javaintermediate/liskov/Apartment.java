package qa.com.javaintermediate.liskov;

public abstract class Apartment {
	//ATTRIBUTES
	
	private int squareFootage;
    private int numberOfBedrooms;
    
    public abstract void setSquareFootage(int sqft);
    
    
    //GETTERS
    public int getSquareFootage() {
        return squareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}