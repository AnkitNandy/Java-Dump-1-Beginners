/*To check if a character is in lower or upper case.
 * Then convert it to the other opposite case.
 */
import java.util.*;
public class UpperLowerCasesCharacters
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:-");
        char c=sc.next().charAt(0);
        char ch;
        if (Character.isLetter(c)==false)
        {
        System.out.println("It must be an alphabet."+"\n"+"Try Again.");
        System.exit(0);
        }
        if (Character.isUpperCase(c)==true)
        {
            System.out.println(c+" is an UPPER CASE CHARACTER.");
            System.out.println("Press 'x' if you want to convert "+c+" to a lower case character,"+"\n"+"Otherwise press 'y'");
            System.out.println("Enter your choice:-");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case 'x':
                char low=Character.toLowerCase(c);
                System.out.println("Lower Case of "+c+" =");
                System.out.println(low);
                break;
                case 'y':
                System.out.println("OK, then bye");
                System.exit(0);
                break;
                default:
                System.out.println("Wrong Choice Entered!!"+"\n"+"Try Again");
            }
        }
        else
        {
            System.out.println(c+" is a LOWER CASE CHARACTER.");
            System.out.println("Press 'x' if you want to convert "+c+" to an upper case character,"+"\n"+"Otherwise press 'y'");
            System.out.println("Enter your choice:-");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case 'x':
                char upper=Character.toUpperCase(c);
                System.out.println("Upper Case of "+c+" =");
                System.out.println(upper);
                break;
                case 'y':
                System.out.println("OK, then bye");
                System.exit(0);
                break;
                default:
                System.out.println("Wrong Choice Entered!!"+"\n"+"Try Again");
            }
        }
    }
}