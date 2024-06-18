/**Program that accepts 10 positive numbers
 * and prints the largest odd number. If there are no 
 * odd numbers, the program should print the
 * message to that effect.
 */
import java.util.*;
class Try17
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int large=0,cnt=0;
        System.out.println("Enter 10 positive numbers :-");
        for (int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
            if (i==0)
            large=n[i];
            if (n[i]%2!=0)
            {
                if (n[i]>large)
                large=n[i];
                cnt++;
            }
        }
        if (cnt!=0)
        System.out.println("Largest Positive Odd Number:\n"+large);
        else
        System.out.println("There are no odd numbers!!\nTry Again.");
    }
}