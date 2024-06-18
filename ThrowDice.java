/**To check the number of times 
 * a number is obtained on the dice
 * being thrown by the user in the system
 * depending on the number of throws entered.
 */
import java.util.*;
public class ThrowDice
{
    static int one=0,two=0,three=0,four=0,five=0,six=0;
    static int n,i;
    static double d;
    Scanner sc=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO CHECK THE NUMBER OF TIMES EACH NUMBER IS OBTAINED ON A DICE");
        System.out.println();
        System.out.println("Enter the number of times you want to throw the dice :-");
        n=sc.nextInt();
        System.out.println("You have thrown the dice succesfully"+"\n"+"Now let the computer calculate.");
    }
    public void ThrowCalculate()
    {
        for (i=1;i<=n;i++)
        {
            d=(int)((Math.random()*6)+1);
            if (d==1)
            one++;
            else if (d==2)
            two++;
            else if (d==3)
            three++;
            else if (d==4)
            four++;
            else if (d==5)
            five++;
            else
            six++;
        }
    }
    public void OutputData()
    {
        System.out.println();
        System.out.println("Number of times ONE (1) is obtained = "+one+".");
        System.out.println("Number of times TWO (2) is obtained = "+two+".");
        System.out.println("Number of times THREE (3) is obtained = "+three+".");
        System.out.println("Number of times FOUR (4) is obtained = "+four+".");
        System.out.println("Number of times FIVE (5) is obtained = "+five+".");
        System.out.println("Number of times SIX (6) is obtained = "+six+".");
    }
    public static void main()
    {
        ThrowDice play=new ThrowDice();
        play.InputData();
        play.ThrowCalculate();
        play.OutputData();
    }
}
