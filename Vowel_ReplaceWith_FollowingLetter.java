/**Accept a word and convert it into
 * lower case, if it is in upper case.
 * Display the new word after replacing
 * only the vowels with the letters
 * following it.
 */
import java.util.*;
class Vowel_ReplaceWith_FollowingLetter
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.toLowerCase();
        s=s.trim();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            str=str+(char)(c+1);
            else
            str=str+c;
        }
        System.out.println("After converting the word into lowercase and replacing only the vowels with the letter following it, we get:\n"+str);
    }
}