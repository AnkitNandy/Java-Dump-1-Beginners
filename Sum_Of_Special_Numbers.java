/**To print the sum of negative even numbers,
 * sum of positive odd numbers and
 * sum of even positive numbers from a list
 * of numbers entered by the user. The list
 * terminates when the user enters zero.
 */
import java.util.*;
public class Sum_Of_Special_Numbers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int spe=0;//sum of even positive numbers
        int spo=0;//sum of odd positive numbers
        int sn=0;//sum of negative numbers
        int n;
        System.out.println("Enter the numbers:-");
        do
        {
        n=sc.nextInt();
        if (n<0)
        sn=sn+n;
        else
        {
            if (n>0 && n%2==0)
            spe=spe+n;
            else
            spo=spo+n;
        }
        }
        while(n!=0);
        System.out.println("Sum of negative numbers:-"+"\n"+sn);
        System.out.println("Sum of positive odd numbers:-"+"\n"+spo);
        System.out.println("Sum of positive even numbers:-"+"\n"+spe);
    }
}
