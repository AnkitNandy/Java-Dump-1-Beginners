//Pg 448 -> Question 5
import java.util.*;
class Tollbooth
{
    static int ncars,amount;
    Tollbooth()
    {
        ncars=0;
        amount=0;
    }
    void goodcars()
    {
        ncars++;
        amount+=5;
    }
    void badcars()
    {
        ncars++;
    }
    void display()
    {
        System.out.println("Number of Cars Passed : "+ncars+" cars.");
        System.out.println("Total Amount collected : "+amount);
    }
    public static void main()
    {
        Tollbooth obj=new Tollbooth();
        obj.goodcars();
        obj.badcars();
        obj.display();
    }
}