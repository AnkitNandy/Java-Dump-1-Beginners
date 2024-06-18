/**A class Telcall calculates the monthly bill of
 * a customer. Some of the members of class are:
 * 
 * Class Name : Telcall
 * 
 * Data Members/Instance Variables:
 *         phno - phone number
 *         name - name of customer
 *         n - no. of calls made
 *         amt - bill amount
 *Member Methods:
 *         Tellcall() : Parameterized constructor 
 *                      to assign values to data
 *                      members.
 *     void compute() : to calculate phone bill amt
 *                      based on the slabs 
 *                      given below.
 *    void dispdata() : to display the details in
 *                      specified format.
 *                      
 *    NUMBER OF CALLS                         RATE
 *        1 - 100                 Rs.500/- rental charge only
 *      101 - 200              Rs.1.00/-per call + rental charge
 *      201 - 300              Rs.1.20/-per call + rental charge
 *      above 300              Rs.1.50/-per call + rental charge
 *The calculations need to be done as per the slabs.
 */
import java.util.*;
class Telcall
{
    static long phno;
    static String name;
    static int n;
    static double amt;
    Telcall(long a,String b,int c)
    {
        phno=a;
        name=b;
        n=c;
        amt=0;
    }
    void compute()
    {
        if (n>0 && n<=100)
        amt = 500;
        else if (n<=200)
        amt = 500+(1*n);
        else if (n<=300)
        amt = 500+(1.20*n);
        else
        amt = 500+(1.50*n);
    }
    void dispdata()
    {
        System.out.println("\nYOUR MONTHLY TELEPHONE BILL IS Rs."+amt);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the telephone user:");
        String name=sc.nextLine();
        System.out.println("Enter the Telephone Number:");
        long phno = sc.nextLong();
        System.out.println("Enter the number of calls made:");
        int n=sc.nextInt();
        Telcall obj = new Telcall(phno,name,n);
        obj.compute();
        obj.dispdata();
    }
}