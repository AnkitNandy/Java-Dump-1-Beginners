/**WAP to initialize an array of 5 names 
 * and initialize another array with
 * their respective telephone numbers.
 * Search for a name input by the user,
 * in the list. If found, display
 * "Search Successful" and print the name
 * along with the telephone number, 
 * otherwise display "Search unsuccessful. Name not enlisted".
 */
import java.util.*;
class Telephone_Array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[5];
        long num[]=new long[5];
        int i,j;
        for (i=0;i<5;i++)
        {
            System.out.println("Enter person's name:");
            name[i]=sc.next();
            System.out.println("Enter "+name[i]+"'s Telephone Number:");
            num[i]=sc.nextLong();
            System.out.println("___________________________________________________________________________________");
        }
        System.out.println();
        System.out.println("Enter any name you wish to search from the given list of people:");
        String search=sc.next();
        int pos=-1;
        for (i=0;i<5;i++)
        {
            if (search==name[i])
            {
                pos++;
                break;
            }
        }
        if (pos>-1)
        {
            System.out.println("\nSearch Successful");
            System.out.println("You are searching for:\n"+name[i]+" - "+num[i]);
        }
        else
        System.out.println("Search Unsuccessful. Name not Enlisted !!");
    }
}

       