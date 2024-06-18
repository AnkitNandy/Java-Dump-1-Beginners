//To check the type of token entered by the user
import java.util.*;
class TokenAppearance_Checker
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a token to find its data type:");
        if (sc.hasNextInt())
        System.out.println("\nInteger Data Type");
        if (sc.hasNextLong())
        System.out.println("\nLong Data Type");
        if (sc.hasNextByte())
        System.out.println("\nByte Data Type");
        if (sc.hasNextShort())
        System.out.println("\nShort Data Type");
        if (sc.hasNextFloat())
        System.out.println("\nFloat Data Type");
        if (sc.hasNextDouble())
        System.out.println("\nDouble Data Type");
        if (sc.hasNextLine())
        System.out.println("\nString Data Type");
    }
}