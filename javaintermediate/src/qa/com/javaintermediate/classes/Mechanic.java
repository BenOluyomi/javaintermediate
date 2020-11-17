package qa.com.javaintermediate.classes;

public class Mechanic extends Car{
	private int repairCost;
	public Mechanic(String colour, String model, String mileage) {
		super(colour, model, mileage);
		
	}
	public int getRepairCost() {
		return repairCost;
	}
	public void setRepairCost(int repairCost) {
		this.repairCost = repairCost;
	}

}
