/*
 * Eniola Adegbegha
 * 04/28/2022
 */
public abstract class Vacation {
	
	private String destination;

	public Vacation(String newDestination) 
	{
		destination = newDestination;
	}
	
	public String toString() 
	{
	   return "Destination is " + destination;
	}
	
	public abstract double calcCost();
}
