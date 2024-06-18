//Program to find the sum of first ten odd natural numbers.
public class Sum1
{
    public static void main()
    {
        int i;
        int a=1;
        int sum=0;
        for (i=1;i<=10;i++)
        {
            sum=sum+a;
            a+=2;
        }
        System.out.println("Sum of first ten odd natural numbers :-"+"\n"+sum);
    }
}