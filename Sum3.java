//Program to find the sum of all 3-digit even natural numbers
public class Sum3
{
    public static void main()
    {
        int i,sum=0;
        for (i=100;i<=999;i=i+2)
        {
            sum=sum+i;
        }
        System.out.println("Sum of all three digit even natural numbers :-"+"\n"+sum);
    }
}