//To print the words of a sentence which ends with 'A' or 'a'
import java.io.*;
class Try16
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string :-");
        String s=buf.readLine();
        s=s.trim();
        s=s+" ";
        String s1="",s2="";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            {
                if (s.charAt(i-1)=='A'||s.charAt(i-1)=='a')
                {
                    s1=s1+s2+"\n";
                }
                else
                {
                    s2="";
                    continue;
                }
            }
            else 
            s2=s2+s.charAt(i);
        }
        System.out.println(s1);
    }
}