/**Accept a string in upper case
 * and replace all the vowels
 * with Asterisk(*) present in
 * the string.
 */
import java.util.*;
class Vowel_Asterisk
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.toUpperCase();
        s=s.trim();
        String str="";
        char c;
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            str=str+"*";
            else
            str=str+c;
        }
        System.out.println("New String Formed =\n"+str);
    }
}