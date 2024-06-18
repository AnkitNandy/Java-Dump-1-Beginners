/**To input a sentence and dislay only those words
 * which begin with a vowel.
 */
import java.io.*;
class Vowel_Beginning
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string :-");
        String s=buf.readLine();
        System.out.println();
        s=s.trim();
        s=s+" ";
        String str="";
        char ch;
        int j=0;
        System.out.println("Words which begin with a vowel =");
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            {
                str=s.substring(j,i);
                ch=str.charAt(0);
                if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                {
                    System.out.println(str);
                }
                j=i+1;
            }
        }
    }
}