/**Input a sentence in uppercase.
 * Create a new sentence by replacing
 * each vowel with the next vowel and
 * the other characters remain the same.
 * Display the new sentence accordingly.
 */
import java.util.*;
class Vowel_ReplaceWith_FollowingVowel
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=s.toUpperCase();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c=='A')
            c='E';
            else if (c=='E')
            c='I';
            else if (c=='I')
            c='O';
            else if (c=='O')
            c='U';
            else if (c=='U')
            c='A';
            str=str+c;
        }
        System.out.println("New String:\n"+str);
    }
}