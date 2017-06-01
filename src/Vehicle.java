
public class Vehicle {
	private String make;
	private String plateNumber;
	private int numberOfWheels;
	private String color;
	
	
	public Vehicle()
	{ 
		make=null;
		plateNumber=null;
		numberOfWheels=0;
		color=null;
	}
	public Vehicle(String newMake,String newPlateNumber,String newColor,int newNumberOfWheels)
	{ 
		make=newMake;
		plateNumber=newPlateNumber;
		color=newColor;
		numberOfWheels=newNumberOfWheels;
	}
	public void setVehicle(String newMake,String newPlateNumber,String color,int newNumberOfWheels)
	{ 
		this.make=newMake;
		this.plateNumber=newPlateNumber;
		this.color=color;
		this.numberOfWheels=newNumberOfWheels;
	}
	public void setVehicle(String make,String color)
	{ 
		this.make=make;
		this.color=color;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String display() {
		
	    return "The"+ " "+color+" "+make;
	}

}
