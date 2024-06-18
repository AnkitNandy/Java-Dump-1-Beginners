//Program to find the sum of first ten even natural numbers.
public class Sum2
{
    public static void main()
    {
        int i;
        int a=2;
        int sum=0;
        for (i=1;i<=10;i++)
        {
            sum=sum+a;
            a+=2;
        }
        System.out.println("Sum of first ten even natural numbers :-"+"\n"+sum);
    }
}