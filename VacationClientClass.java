/*
 * Eniola Adegbegha
 * 04/28/2022
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
public class VacationClientClass {

	public static void main(String[] args) {
		
		DecimalFormat icPattern = new DecimalFormat("$#,###.##");
		
		ArrayList<Vacation> VacationList;
		VacationList = new ArrayList<Vacation>( );
		 
		VacationList.add(new AllInclusliveVacation("lasgidi","ClubMed", 0 , 20000.9876));
		VacationList.add(new PieceMealVacation("Dubai",5000,-2,-2000));
		 
		 
		 // prints toString() 
		 for ( Vacation s : VacationList )
		 {
		     System.out.println( s.toString());
		     System.out.println( );
		 }
		 System.out.println( );
		    
		 // calcCost() of vacation
		 System.out.println("The Cost of Vacation is:" );
		 for ( Vacation s : VacationList )
		 {
		     System.out.println( icPattern.format(s.calcCost( )));
		     System.out.println( );
		 }

	}

}
