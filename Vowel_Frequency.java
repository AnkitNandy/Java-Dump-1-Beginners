/**Accept a string in upper case
 * and then find the frequency of
 * each vowel present in the string.
 */
import java.util.*;
class Vowel_Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.toUpperCase();
        char c;
        int a=0,e=0,i=0,o=0,u=0;
        for (int k=0;i<s.length();k++)
        {
            c=s.charAt(k);
            if (c=='A')
            a++;
            else if (c=='E')
            e++;
            else if (c=='I')
            i++;
            else if (c=='O')
            o++;
            else if (c=='U')
            u++;
        }
        System.out.println("Frequency of 'A' = "+a);
        System.out.println("Frequency of 'E' = "+e);
        System.out.println("Frequency of 'I' = "+i);
        System.out.println("Frequency of 'O' = "+o);
        System.out.println("Frequency of 'U' = "+u);
    }
}