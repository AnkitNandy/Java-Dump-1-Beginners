/* Unique String - None of the letters
 * in the word are repeated.
 * Example : COMPUTER
 */
class Unique_String
{
    public static void main(String s)
    {
        s = s.trim();
        s = s.toUpperCase();
        int flag=0;
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            for (int j=i+1;j<s.length();j++)
            {
                if (s.charAt(j)==ch)
                {
                    flag++;
                    break;
                }
            }
        }
        if (flag==0)
        System.out.println("The word '"+s+"' is an Unique String.");
        else
        System.out.println("The word '"+s+"' is NOT an Unique String !!");
    }
}