//To find the sum of all 3-digit even natural numbers
public class Try8
{
    public static void main()
    {
        int i;
        int sum=0;
        for (i=100;i<=999;i++)
        {
            if (i%2==0)
            sum=sum+i;
        }
        System.out.println("Sum of all 3-digit even natural numbers :-");
        System.out.println(sum);
    }
}