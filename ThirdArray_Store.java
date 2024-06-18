/**Store 6 elements in an array p 
 * and 4 elements in an array q.
 * Now, produce a third array r,
 * containing all elements of array p and q.  
 */
class ThirdArray_Store
{
    static void main()
    {
        int p[]={1,5,8,3,2,9};
        int q[]={6,7,4,1};
        int r[] = new int[10];
        for (int i=0;i<10;i++)
        {
            if (i<6)
            r[i]=p[i];
            else
            r[i]=q[i-6];
        }
        for (int i=0;i<10;i++)
        {
            System.out.println("r["+i+"] = "+r[i]);
        }
    }
}