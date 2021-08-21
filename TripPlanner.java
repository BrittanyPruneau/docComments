package docComments;

/**
 * Defines departure location, arrival location, distance traveled, and fuel consumption required for a trip.
 * 
 * @author BrittanyPruneau 
 */

public class TripPlanner
{
	private String departure; 
	private String arrival; 
	private int distance;
	private Car car;
	
	/**
	 * Constructor initializes the fields.
	 * 
	 * @param departure		departure location.
	 * @param arrival		arrival location.
	 * @param distance		total distance traveled between departure and arrival locations.
	 * @param car			car object with car functionality. 
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) 
	{
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="
				+ car.getModel() + "]";
	}

	/**
	 * 
	 * @returns the gallonsNeeded.
	 * fuelConsumption returns the number of gallons of gas needed to travel the total distance.
	 */
	public double fuelConsumption()
	{
		double gallonsNeeded = (1d/(car.getMpg())*(distance));
		return  gallonsNeeded;  
	}	
}
