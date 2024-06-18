import java.util.*;
class Word_Replace
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        System.out.println("Enter a word in this sentence which you want to replace:");
        String a=sc.nextLine();
        System.out.println("Enter the word which you want to replace "+a+" with:");
        String replace=sc.nextLine();
        System.out.println("\nThe new sentence becomes ->");
        String str="",res="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch!=' ')
            str = str+ch;
            else
            {
                if (str.equalsIgnoreCase(a))
                res = res + replace;
                else
                res = res + str;
            }
        }
        System.out.println(res);
    }
}