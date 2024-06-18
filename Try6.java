import java.util.*;
class Try6
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num=scan.nextInt();
        int i,d,sum=0;
        int n;
        n=num;
        for (i=0;num>0;i++)
        {
            d=num%10;
            sum=sum+(d*d*d);
            num=num/10;
        }
        if (sum==n)
        System.out.println(n+" is an armstrong number.");
        else
        System.out.println(n+" is not an armstrong number.");
    }
}