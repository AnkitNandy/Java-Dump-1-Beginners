/**Using a switch statement, write a menu-driven
 * program to convert a given temperature from
 * Fahrenheit to Celcius and vice-versa. For an
 * incorrect choice, an appropriate error message
 * should be displayed.
 * (HINT:C = (5/9)*(F-32)
 *  and F = 1.8*C+32)
 */
import java.util.*;
class Temperature_Converter
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO TEMPERATURE CONVERTER\n");
        System.out.println("Press 1 to convert Celcius to Fahrenhite");
        System.out.println("Press 2 to convert Fahrenhite to Celcius");
        System.out.println("\nEnter your choice:");
        int choice=sc.nextInt();
        double C=0.0,F=0.0;
        switch(choice)
        {
            case 1:
            System.out.println("\nEnter temperature in Celcius:");
            C=sc.nextDouble();
            F=1.8*C+32;
            System.out.println("\nTemperature in Fahrenhite = "+F+" degrees.");
            break;
            case 2:
            System.out.println("\nEnter temperature in Fahrenhite:");
            F=sc.nextDouble();
            C=(5.0/9.0)*(F-32);
            System.out.println("\nTemperature in Celcius = "+C+" degrees.");
            break;
            default:
            System.out.println("\nWrong Choice Entered!!");
        }
    }
}