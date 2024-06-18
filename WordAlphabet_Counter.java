/**Input a line of text consisting of sentences terminated by 
 * either "." or "!" or "?".
 * The words in the sentences may be separated by multiple 
 * spaces. The program should output:
 * i) The total number of words
 * ii)The total number of alphabets in the given text.
 */
import java.io.*;
class WordAlphabet_Counter
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of sentences separated and terminated by '.','!' or '?' :-");
        String s=buf.readLine();
        System.out.println();
        s=s.trim();
        s=s+" ";
        int w=0;
        int a=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ' && s.charAt(i-1)!=' ')
            w++;
            else if (Character.isLetter(s.charAt(i)))
            a++;
        }
        System.out.println("Total number of words in the given string = \n"+w);
        System.out.println("Total number of alphabets in the given text of sentences =\n"+a);
    }
}