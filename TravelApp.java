package docComments;
/**
 * Prints cars by make, model, mileage, and the amount of gallons needed for a specified trip. 
 * 
 * @author BrittanyPruneau
 *
 */
public class TravelApp 
{

	public static void main(String[] args) 
	{
		Car m4 = new Car("BMW", "M4", 25);
		Car HondaCivic = new Car("Honda", "Civic", 42);
		System.out.println("Cars: ");
		System.out.println(m4.getMake() + " " + m4.getModel() + " " + m4.getMpg() + "mpg");
		System.out.println(HondaCivic.getMake() + " " + HondaCivic.getModel() + " " + HondaCivic.getMpg() + "mpg");
		System.out.printf("%n");
		
		TripPlanner CaliforniaTrip = new TripPlanner("SF", "LA", 382, m4);
		TripPlanner FloridaTrip = new TripPlanner("Tampa", "Miami", 280, HondaCivic);
		System.out.println("California Trip");
		System.out.println(CaliforniaTrip);
		System.out.printf("fuel consumption:  " + "%3.1f " + "gallons" + "%n%n", CaliforniaTrip.fuelConsumption());
		System.out.println("Florida Trip");
		System.out.println(FloridaTrip);
		System.out.printf("fuel consumption:  " + "%3.1f " + "gallons", FloridaTrip.fuelConsumption());	

	}

}
