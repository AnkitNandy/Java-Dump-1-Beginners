//To find the sum of all 3-digit odd natural numbers which are multiples of 5
public class Try9
{
    public static void main()
    {
        int i;
        int sum=0;
        for (i=100;i<=999;i++)
        {
            if (i%2!=0 && i%5==0)
            sum=sum+i;
        }
        System.out.println("Sum of all 3-digit odd natural numbers which are multiples of 5 :-");
        System.out.println(sum);
    }
}