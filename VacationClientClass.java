/*
 * YYetunde Eniola Adegbegha
 * Chapter 10 Individual Lab
 * 04/28/2022
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
public class VacationClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat icPattern = new DecimalFormat("$#,###.##");
		
		ArrayList<Vacation> VacationList;
		VacationList = new ArrayList<Vacation>( );
		 
		VacationList.add(new AllInclusliveVacation("lasgidi","ClubMed", 0 , 20000.9876));
		VacationList.add(new PieceMealVacation("Dubai",5000,-2,-2000));
		 
		 
		 //arraylist to print toString() 
		 for ( Vacation s : VacationList )
		 {
		     System.out.println( s.toString());
		     System.out.println( );
		 }
		 System.out.println( );
		    
		 //ouputs calcCost() of vacation
		 System.out.println("The Cost of Vacation is:" );
		 for ( Vacation s : VacationList )
		 {
		     System.out.println( icPattern.format(s.calcCost( )));
		     System.out.println( );
		 }

	}

}
/*DecimalFormat pattern= new DecimalFormat("##.##");

String [] student = {"Student1", "Student2", "Student3", "Student4"};
double [][] course = { {75.20, 84.60, 72.50, 85.60, 78.00},
        {65.20, 99.70, 82.00, 90.00, 89.00},
        {95.20, 84.50, 74.50, 88.00, 90.00} };

System.out.println( "\tStudent1" + "\tStudent2" + "\tStudent3" + "\tStudent4" + "\tTotal" + "\t  Average");

double total;	 
double average;	
for ( int i = 0; i < course.length; i++ )
{
	  System.out.println( );
     System.out.print(  (i+1) + "      \t" );
     
	  total=0;
	  average=0;
	  
    for ( int j = 0; j < course[0].length; j++ )
    {
     	 System.out.print(course [i][j] + "      \t" );          // prints row sales for each salesperson
     	 total += course[i][j];                            //accumulates row
     	 average = total /course[0].length ;
	 }
      System.out.print(pattern.format(total));                           //prints total of row 
      System.out.println( );
      System.out.print(pattern.format(average));
      System.out.println( );

     }*/