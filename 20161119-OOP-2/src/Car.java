
public class Car {

	public String colour;
	public int productionYear;
	public int cubicCapacity;
	public byte countDoors;
	public String manufacturer;
	public double co2Value;
	public Engine engine;
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public void setColour2(String colour2)
	{
		colour = colour2;
	}
	
	public double co2ValueOfficial()
	{
		return co2Value / 2;
	}
	
	public double co2ValueInternal()
	{
		return co2Value;
	}
	
}