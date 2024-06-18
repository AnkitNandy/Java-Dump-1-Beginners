/**To calculate the taxi fare.
 * Input the customer's name,
 * taxi number and the
 * number of kilometers travelled 
 * by him/her.
 * Compute the amount that
 * the customer pays for 
 * the taxi that he hires.
 */
import java.util.*;
public class TaxiFare
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int tnum;//taxi number
        double km,pay;
        System.out.println("Taxi Charges");
        System.out.println("    KMS TRAVELLED               AMOUNT PER KM");
        System.out.println("      Upto 1 Km                     Rs 25    ");
        System.out.println("    2 km to 6 km                    Rs 10    ");
        System.out.println("    7 km to 12 km                   Rs 15    ");
        System.out.println("   13 km to 18 km                   Rs 20    ");
        System.out.println("   More than 18 km                  Rs 25    ");
        System.out.println("______________________________________________________");
        System.out.println("Enter name of the taxi customer:-");
        name=sc.nextLine();
        System.out.println("Enter the taxi number:-");
        tnum=sc.nextInt();
        System.out.println("Enter the number of kilometers travelled by him:-");
        km=sc.nextDouble();
        if (km<=1)
        pay=25*km;
        else if (km>1&&km<=6)
        pay=10*km;
        else if (km>6&&km<=12)
        pay=15*km;
        else if (km>12&&km<=18)
        pay=20*km;
        else 
        pay=25*km;
        System.out.println("NAME          TAXI NO.          KILOMETERS TRAVELLED         TAXI FARE");
        System.out.println(""+name+"                                                               ");
        System.out.println("              "+tnum+"                                                 ");
        System.out.println("                                     "+km+"                            ");
        System.out.println("                                                               "+pay+" ");
    }
}