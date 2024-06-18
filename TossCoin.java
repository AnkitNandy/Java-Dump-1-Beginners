/**To check the number of times the user
 * gets HEADS or TAILS respectively, 
 * depending on the numberof tosses 
 * entered by the user.
 */
import java.util.*;
public class TossCoin
{
    int h=0,t=0,n,i;
    double d;
    Scanner sc=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO CHECK THE NUMBER OF TAILS AND THE NUMBER OF HEADS IN A GIVEN NUMBER OF TOSSES");
        System.out.println();
        System.out.println("Enter the number of tosses you want to take:-");
        n=sc.nextInt();
    }
    public void TossCalculate()
    {
        for (i=1;i<=n;i++)
        {
            d=(int)(Math.random()*2);
            if (d==1)
            h++;
            else
            t++;
        }
    }
    public void OutputData()
    {
        System.out.println("In "+n+" tosses:");
        System.out.println("Number of times HEAD is obtained - "+h+", and");
        System.out.println("Number of times TAIL is obtained - "+t+".");
    }
    public static void main()
    {
        TossCoin play=new TossCoin();
        play.InputData();
        play.TossCalculate();
        play.OutputData();
    }
}
