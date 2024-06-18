import java.util.*;
public class TwoDigitReverser
{
    public static void main()
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit: ");
        a=sc.nextInt();
        System.out.println("Enter second digit: ");
        b=sc.nextInt();
        int c;
        c=10*a+b;
        System.out.println("The number is: "+"\n"+c);
        int reverse;
        reverse=10*b+a;
        System.out.println("The reverse of the number is: "+"\n"+reverse);
    }
}
        