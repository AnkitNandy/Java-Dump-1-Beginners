/**A number is said to be 'Twisted Prime',
 * if the new number obtained after reversing
 * the digits is also a prime number. Write a
 * program to accept a number and check whether
 * the number is 'Twisted Prime' or not.
 */
import java.util.*;
class Twisted_Prime
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a prime integer to see if it is a Twisted Prime Number :-");
        int num=sc.nextInt();
        System.out.println();
        int a=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            a++;
        }
        if (a!=2)
        {
        System.out.println("The integer you entered is not a prime number.\nTry Again!!");
        System.exit(0);
        }
        int n=num;
        int d,rev=0;
        while (n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        int cnt=0;
        for (int j=1;j<=rev;j++)
        {
            if (rev%j==0)
            cnt++;
        }
        if (cnt==2)
        System.out.println(num+" is A TWISTED PRIME NUMBER.");
        else
        System.out.println(num+" is NOT A TWISTED PRIME NUMBER.");
    }
}