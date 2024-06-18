/**         2
 *        2 4
 *      2 4 6
 *    2 4 6 8
 */
class Try19
{
    static void main()
    {
        int i,j,k,p=0;
        for (i=1;i<=4;i++)
        {
            for (k=10;k>=p;k-=2)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print((j*2)+" ");
            }
            System.out.println();
            p+=4;
        }
    }
}