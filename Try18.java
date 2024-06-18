/**Store the names of any 10 elements
 * of the periodic table in a string type
 * array along with their atomic number
 * in an Integer array. Sort the element
 * in ascending order of their atomic
 * number using any standard sorting
 * technique and display the names of
 * elements along with their atomic
 * number after sorting.
 */
import java.util.*;
class Try18
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[3];
        int a[]=new int[3];
        for (int i=0;i<3;i++)
        {
            System.out.println("Enter the name of an element in the periodic table :-");
            s[i]=sc.next();
            System.out.println("Enter its atomic number :-");
            a[i]=sc.nextInt();
        }
        int swap=0,smallestindex=0;
        String change="";
        for (int i=0;i<2;i++)
        {
            smallestindex=i;            
            for (int j=i+1;j<3;j++)
            {
                if (a[j]<a[smallestindex])
                {
                    smallestindex=j;
                }
            }
            swap=a[i];
            a[i]=a[smallestindex];
            a[smallestindex]=swap;
            change=s[i];
            s[i]=s[smallestindex];
            s[smallestindex]=change;       
        }
        for (int i=0;i<3;i++)
        {
            System.out.print(s[i]+" ");
            System.out.println(a[i]+" ");
        }
    }
}