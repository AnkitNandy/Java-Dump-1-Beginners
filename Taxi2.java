/**A taxi charges from the passenger according to given tariff:-
 *   DISTANCE                 RATE
 * Upto 5 km                Rs 100
 * For next 10 km           Rs 10/km
 * For next 10 km           Rs 8/km
 * More than 25 km          Rs 5/km
 *Input the distance covered and calculate the 
 *amount to be paid by the passenger along with 
 *the taxi number.
 */
import java.util.*;
public class Taxi2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        long tno;
        int d,amt;
        System.out.println("Enter the taxi number:-");
        tno=sc.nextInt();
        System.out.println("Enter the distance covered by the taxi(in kms):-");
        d=sc.nextInt();
        if (d>1&&d<=5)
        amt=100;
        else if (d<=15)
        amt=100+(d-5)*10;
        else if (d<=25)
        amt=100+10*10+(d-15)*8;
        else 
        amt=100+10*10+8*10+(d-25)*5;
        System.out.println("          BILL");
        System.out.println("   Taxi No.     : "+tno);
        System.out.println("Distance Covered: "+d+" kms.");
        System.out.println("    Amount      : Rs."+amt);
    }
}