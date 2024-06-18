/**To print the sum of negative numbers,
 * sum of positive even numbers and then
 * sum of positive odd numbers from a list
 * of numbers entered by the user. The list
 * terminates when the user enters a zero(0).
 */
import java.util.*;
public class ZeroTerminate_With_Sum
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter as many integers as you want and then terminate your input by pressing zero(0) :-");
        int sn=0;//sum of negative numbers
        int spo=0;//sum of positive odd numbers
        int spe=0;//sum of positive even numbers
        int num=1;
        while (num!=0)
        {
            num=scan.nextInt();
            if (num<0)
            sn=sn+num;
            else if (num>0 && num%2==0)
            spe=spe+num;
            else if (num>0 && num%2!=0)
            spo=spo+num;
        }
        System.out.println();
        System.out.println("Sum of Negative Numbers = "+sn+".");
        System.out.println("Sum of Positive Even Numbers = "+spe+".");
        System.out.println("Sum of Positive Odd Numbers = "+spo+".");
    }
}