import java.util.*;
public class Try3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num=sc.nextInt();
        int i;
        System.out.println("Factors of "+num+" :-");
        for (i=1;i<=num;i++)
        {
            if (num%i==0)
            System.out.println(i);
        }
    }
}