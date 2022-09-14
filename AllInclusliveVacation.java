/*
 * YYetunde Eniola Adegbegha
 * Chapter 10 Individual Lab
 * 04/28/2022
 */
import java.text.DecimalFormat; 

public class AllInclusliveVacation extends Vacation{
	
	private String brand;
	private int rating;
	private double price;
	
	public AllInclusliveVacation(String newDestination, String newBrand, int newRating, double newPrice)
	{
		super(newDestination);		
		brand = newBrand;
		setRating(newRating);
		setPrice(newPrice);
		
	}
	
	public void setPrice(double newPrice) 
	{
		if ( newPrice >= 0.0)
	          price = newPrice;
	       else
		      price = 0.0;
	}
	
	public void setRating(int newRating) 
	{
		if ( newRating > 0 )
	          rating = newRating;
	       else
		      rating = 0;
	}

	public double calcCost() 
	{

		return price;
	}
	
	public String toString() 
	{
		DecimalFormat icPattern = new DecimalFormat("$#,###.##");
		return super.toString() + "\nBrand: " + brand+ "\nRate between 1-5 stars: " + 
	                         rating + "\nCost of vacation is " + icPattern.format(price);
	}

}
