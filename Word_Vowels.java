//To print the frequency of vowels in each word along with the word
import java.util.*;
class Word_Vowels
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        String str="";
        int cnt=0;
        System.out.println("\nWORD        FREQUENCY");
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch!=' ')
            {
                str=str+ch;
                if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
                    ch=='O'||ch=='o'||ch=='U'||ch=='u')
                cnt++;
            }
            else
            {
                System.out.print(str+"            "+cnt);
                str="";
                cnt=0;
            }
        }
    }
}