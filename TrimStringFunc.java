//To remove the leading and trailing blanks from an entered string
import java.util.*;
public class TrimStringFunc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a string:-");
        str=sc.nextLine();
        System.out.println();
        String s=str.trim();
        System.out.println("By removing the leading and trailing blanks from the given string,"+"\n"+"We get:-");
        System.out.println(s);
    }
}