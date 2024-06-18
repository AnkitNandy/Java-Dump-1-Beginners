/*Program that computes tax for income of 
 * required input from user(in Rs).
 * The income upto Rs 300000 is not taxable
 * and the tax is computed as 15% of 
 * the taxable income.
 */
import java.util.*;
public class TaxableIncome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int inc;//inc stands for income
        double taxable,tax;
        System.out.println("Program that computes tax for income of required input from user(in Rs)???");
        System.out.println();
        System.out.println("Enter the income in Rs:-");
        inc=sc.nextInt();
        if (inc<=300000)
        System.out.println("Income of Rs."+inc+"/- is NOT TAXABLE.");
        else 
        {
            System.out.println("Income of Rs."+inc+"/- IS TAXABLE.");
            taxable=inc-300000;
            tax=taxable*0.15;
            System.out.println("Therefore,"+"\n"+"For income of Rs."+inc+",");
            System.out.println("tax to be paid is Rs."+tax);
        }
    }
}
            