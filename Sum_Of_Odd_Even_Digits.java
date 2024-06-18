/**To pass an integer
 * as argument and to
 * find the sum of even
 * and odd digits separately.
 */
public class Sum_Of_Odd_Even_Digits
{
    public static void main(int num)
    {
        int digits,sum_odd=0,sum_even=0;
        while (num!=0)
        {
            digits=num%10;
            if (digits%2==0)
            {
                sum_even = sum_even+digits;
            }
            else
            {
                sum_odd = sum_odd+digits;
            }
            num=num/10;
        }
        System.out.println("Sum of Even Digits = "+sum_even);
        System.out.println("Sum of Odd Digits = "+sum_odd);
    }
}
            