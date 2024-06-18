/**Accept a word / a string and display
 * the new string after removing all 
 * the vowels present in it.
 */
import java.util.*;
class Vowel_Remover
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string or a word :-");
        String s=sc.nextLine();
        System.out.println();
        String str="";
        char c;
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
            str=str+"";
            else
            str=str+c;
        }
        System.out.println("After removing all the vowels, we get :\n"+str);
    }
}