/**Input 3 numbers(positive or negative)
 * If unequal, display the greatest one.
 * Otherwise display equal.
 * Find and display which of them
 * are positive and which are negative.
 */
import java.util.*;
public class ThreeNumbersTest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,max;
        System.out.println("Enter any three numbers:-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a==b&&b==c&&a==c)
        System.out.println("All the three numbers are equal");
        else
        System.out.println("All the three numbers are unequal");
        {
            if (a>0&&b>0&&c>0)
            System.out.println("All positive");
            else if (a<0&&b<0&&c<0)
            System.out.println("All negative");
            else
            System.out.println("The combination of positive and negative numbers");
            max=(a>b)?(a>c)?a:c:(b>c)?b:c;
            System.out.println("The maximum number is "+max);
        }
    }
}

               