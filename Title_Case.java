/**To input a sentence and change it to its Title case.
 * Title case means to change the first alphabet of 
 * every word to capital and rest to small letters.
 */
import java.util.*;
class Title_Case
{
    public static void main()
    {        
        Scanner sc=new Scanner(System.in);                                                                               
        System.out.println("Enter a string:-");
        String s=sc.nextLine();
        String t="";
        s=s.toLowerCase();
        t=t+Character.toUpperCase(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {      
            if(s.charAt(i)==' ')
            t=t+" "+Character.toUpperCase(s.charAt(++i));
            else
            t=t+s.charAt(i);
        }
        System.out.print("Title Case is :\n"+t);
    }
}                