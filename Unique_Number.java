/**A number is said to be unique if the
 * digits are not repeated in it. Accept
 * a number and check whether the number
 * is unique or not.
 */
import java.io.*;
class Unique_Number
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer to check if it is a Unique Number :-");
        int num=Integer.parseInt(buf.readLine());
        System.out.println();
        int n=num;
        int a=0,b=0,d;
        int digit=num%10;
        while (n!=0)
        {
            d=n%10;
            a++;
            n=n/10;
            if (d==digit)
            b++;
        }
        if (a==b)
        System.out.println("All the digits are NOT UNIQUE.");
        else
        System.out.println("All the digits are UNIQUE.");
    }
}