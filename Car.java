package docComments;

/**
 * Represents a car's make, model, and the miles per gallon the car will run off of. 
 * 
 * @author BrittanyPruneau
 *
 */

public class Car 
{
	private String make; 
	private String model; 
	private int mpg;
	
	/**
	 * Constructor initializes the fields. 
	 * 
	 * @param make		Car manufacturer
	 * @param model		Vehicle model
	 * @param mpg		Distance in miles the car will travel using 1 gallon of gas. 
	 */
	public Car(String make, String model, int mpg) 
	{
		this.make = make;
		this.model = model;
		this.mpg = mpg;  
	}

	/**
	 * @returns the car manufacturer
	 */
	public String getMake() 
	{
		return make;
	}

	/**
	 * @returns the model of the vehicle. 
	 */
	public String getModel() 
	{
		return model;
	}

	/**
	 * @returns the miles the car will travel per gallon of gas. 
	 */
	public int getMpg() 
	{
		return mpg;
	}
}
