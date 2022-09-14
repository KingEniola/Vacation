/*
 * Eniola Adegbegha
 * 04/28/2022
 */
import java.text.DecimalFormat;

public class PieceMealVacation extends Vacation {

	private double hotel;
	private double meal;
	private double airfare;
	
	public PieceMealVacation(String newDestination, double newHotel,double newMeal, double newAirfare)
	{
		super(newDestination);		
		setHotel(newHotel);
		setMeal(newMeal);
		setAirfare(newAirfare);
		
	}

	public double calcCost() 
	{
		double vacation = 0.0;
		vacation = hotel+meal+airfare;
		return vacation;
	}
	
	public void setHotel(double newHotel) 
	{
		if ( newHotel >= 0.0)
	         hotel = newHotel;
	       else
		      hotel = 0.0;
	}
	
	public void setMeal(double newMeal) 
	{
		if ( newMeal >= 0.0)
	          meal = newMeal;
	       else
		      meal = 0.0;
	}
	
	public void setAirfare(double newAirfare) 
	{
		if ( newAirfare >= 0.0)
	          airfare = newAirfare;
	       else
		      airfare = 0.0;
	}
	
	public String toString()
	{
		DecimalFormat icPattern = new DecimalFormat("$#,###.##");
		return super.toString() + "\nCost of Hotel: " + icPattern.format(hotel) + "\nCost of Meal: "
			          + icPattern.format(meal) + "\nCost of airfare: "+ icPattern.format(airfare) ;
	}
}
