/**A sum-product number is an integer that is equal to
 * the sum of its digits times the product of its digits.
 * Input a number and check whether it is a Sum-Product 
 * Number or not.
 */
import java.io.*;
class SumProduct_Number
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer to check if if it a Sum-Product Number :-");
        int num=Integer.parseInt(buf.readLine());
        System.out.println();
        int d,s=0,p=1;
        int n=num;
        while (n!=0)
        {
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if (s==p)
        System.out.println(num+" is A SUM-PRODUCT NUMBER.");
        else
        System.out.println(num+" is NOT A SUM-PRODUCT NUMBER.");
    }
}