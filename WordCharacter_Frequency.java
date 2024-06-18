import java.util.*;
class WordCharacter_Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s=sc.nextLine();
        s=s.trim();
        int cnt=0;
        System.out.println("\nCHARACTER    FREQUENCY");
        for (char ch='A';ch<='Z';ch++)
        {
            cnt=0;
            for (int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if (c==ch || c==(char)(ch+32))
                cnt++;
            }
            if (cnt!=0)
            System.out.println("     "+ch+"              "+cnt);
        }
    }
}