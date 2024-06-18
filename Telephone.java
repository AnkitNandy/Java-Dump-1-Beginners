//Pg 405 -> Question 09 in textbook
import java.util.*;
class Telephone
{
    int prv,pre,call;
    double amt,total;
    String name;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Previous Telephone Meter Reading:");
        prv=sc.nextInt();
        System.out.println("Enter the Present Telephone Meter Reading:");
        pre=sc.nextInt();
        call = pre-prv;
        System.out.println("Enter the Name of the Customer:");
        name = sc.next();
    }
    void cal()
    {
        if (call<=100)
        amt=0;
        else if (call<=200)
        amt = 0*100 + 0.9*(call-100);
        else if (call<=400)
        amt = 0*100 + 0.9*100 + 0.8*(call-200);
        else
        amt = 0*100 + 0.9*100 + 0.8*200 + 0.7*(call-400);
        total = 180+amt;
    }
    void display()
    {
        System.out.println("\n\t\t\tTELEPHONE BILL");
        System.out.println("NAME OF THE CUSTOMER    CALLS MADE    AMOUNT TO BE PAID");
        System.out.println("    "+name+"                "+call+"        Rs."+total);
    }
    public static void main()
    {
        Telephone object = new Telephone();
        object.input();
        object.cal();
        object.display();
    }
}