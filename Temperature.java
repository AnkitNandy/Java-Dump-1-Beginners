/*This program is to convert 
 * celcius to fahrenheit and ]
 * fahrenhite to celcius depending
 * upon the user's choice
 */
import java.util.*;
public class Temperature
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        char choice;
        double c,f;
        System.out.println("C - Celcius");
        System.out.println("F - Fahrenhite");
        System.out.println("Press C or F for temperature unit which has to be converted.");
        System.out.println("Enter your choice:-");
        choice=sc.next().charAt(0);
        switch(choice)
        {
            case 'C':
            System.out.println("Enter the temperature in Celcius:-");
            c=sc.nextDouble();
            f=1.8*c+32.0;
            System.out.println("Temperature to fahrenheit=??");
            System.out.println(c+" degree celcius to fahrenheit is - ");
            System.out.println(+f+" degree Fahrenheit.");
            break;
            case 'F':
            System.out.println("Enter the temperature in Fahrenheit:-");
            f=sc.nextFloat();
            c=(5.0/9.0)*(f-32);
            System.out.println("Temperature to celcius is ??");
            System.out.println(f+" degree fahrenheit to celcius is - ");
            System.out.println(+c+" degree Celcius.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!!!");
            System.out.println("You must enter either F or C.");
        }
    }
}
