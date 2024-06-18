//To check for an existing gap or blank in a character entered by the user
public class Whitespace
{
    public static void main(String args[])
    {
        System.out.println();
        char c=' ';
        boolean b=Character.isWhitespace(c);
        if (b==true)
        System.out.println(" ' ' is a character with a whitespace.");
        else
        System.out.println(c+" is not a whitespace character.");
    }
}