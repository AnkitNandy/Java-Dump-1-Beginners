/*Print each word of the sentence along with the 
 * number of characters in it.
 */
class Word_AsciiSum
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        String str="";
        int sum=0;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch!=' ')
            {
                str=str+ch;
                sum=sum+(int)ch;
            }
            else
            {
                System.out.println(str+" -> "+sum);
                str="";
                sum=0;
            }
        }
    }
}