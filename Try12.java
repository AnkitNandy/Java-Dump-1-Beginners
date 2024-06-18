//To find the index of a character in a string.
import java.util.*;
public class Try12
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string of your choice :-");
        String s=scan.nextLine();
        System.out.println("Enter the character for which you want to know the index in the string :-");
        char c=scan.next().charAt(0);
        System.out.println();
        int result=s.indexOf(c);
        System.out.println("Index of "+c+" in the given string =");
        System.out.println(result);
    }
}