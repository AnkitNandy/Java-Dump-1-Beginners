/**           5
 *           5 4
 *          5 4 3
 *         5 4 3 2
 */
class Test1
{
    public static void main()
    {
        int i,j,k;
        for (i=5;i>=2;i--)
        {
            for (k=i;k>=2;k--)
            {
                System.out.print(" ");
            }
            for (j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
            
            