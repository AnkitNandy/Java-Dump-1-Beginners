//To input 10 integers and print the sum of only the even numbers among them.
import java.util.*;
public class Sum_Of_Even_Integers
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter any ten integers of your choice :-");
        for (int i=1;i<=10;i++)
        {
            num=scan.nextInt();
            if (num%2==0)
            sum=sum+num;
        }
        System.out.println("Sum of only the even numbers among the given set of integers ="+"\n"+sum);
    }
}