 /* whether the number is 
 * Neon or not. A number is said tO be Neon
 * if sum of the digits of the square of the number  
 * is equal to the number itsef.
 */
import java.util.*;
class Try7
{
    int n,p,d,s=0;
    Scanner sc=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO CHECK WHETHER A NUMBER ENTERED IS NEON OR NOT");
        System.out.println();
        System.out.println("Enter an integral number :-");
        n=sc.nextInt();        
    }
    public void Calculate()
    {
        p=n*n;
        while (p!=0)
        {
            d=p%10;
            s=s+d;
            p=p/10;
        }
    }
    public void OutputData()
    {
        System.out.println();
        if (s==n)
        System.out.println(n+" is a NEON NUMBER.");
        else
        System.out.println(n+" is NOT A NEON NUMBER.");
    }
    public static void main()
    {
        Try7 obj=new Try7();
        obj.InputData();
        obj.Calculate();
        obj.OutputData();
    }
}
