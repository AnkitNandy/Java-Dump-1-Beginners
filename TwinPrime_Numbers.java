/**To accept two numbers and check whether
 * they are twin prime or not.
 */
import java.io.*;
class TwinPrime_Numbers
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers to check if they are twin primes :-");
        int a=Integer.parseInt(buf.readLine());
        int b=Integer.parseInt(buf.readLine());
        System.out.println();
        int x=0,y=0,c1=0,c2=0;
        for (int i=1;i<=a;i++)
        {
            if (a%i==0)
            c1++;
        }
        if (c1==2)
        x=1;
        for (int j=1;j<=b;j++)
        {
            if (b%j==0)
            c2++;
        }
        if (c2==2)
        y=1;
        if (x==1 && y==1)
        {
            if (a>b)
            {
                if ((a-b)==2)
                System.out.println(a+" and "+b+" are TWIN PRIMES.");
            }
            else
            {
                if ((b-a)==2)
                System.out.println(a+" and "+b+" are NOT TWIN PRIMES.");
            }
        }
    }
}