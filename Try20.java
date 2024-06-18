/**
 *      2        4        6          20
 * 1 - x / 2! + x / 4! - x / 6!.....x  /20!
 */
class Try20
{
    static void main(int x)
    {
        double sum=0.0;
        int a=1;
        for (int i=0;i<=20;i+=2)
        {
            int f=1;
            for (int j=1;j<=i;j++)
            {
                f=f*j;
            }
            if (a%2==0)
            {
                sum=sum-(double)(Math.pow(x,i))/f;
            }
            else
            {
                sum=sum+(double)(Math.pow(x,i))/f;
            }
        }
        System.out.println("Sum of the given series:\n"+sum);
    }
}
            