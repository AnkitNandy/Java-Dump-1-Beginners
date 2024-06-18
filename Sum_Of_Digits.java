/**To pass an integer
 * as argument and to find
 * the sum of its digits.
 */
public class Sum_Of_Digits
{
    public static void main(int num)
    {
        System.out.println("Sum of digits of "+num+" =");
        int digits,sum=0;
        while (num!=0)
        {
            digits=num%10;
            sum=sum+digits;
            num=num/10;
        }
        System.out.println(sum);
    }
}