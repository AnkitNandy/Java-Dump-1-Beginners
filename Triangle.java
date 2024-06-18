//to display the type of triangle with respect to sides
import java.util.*;
public class Triangle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three sides of the triangle:-");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a+b>c&&b+c>a&&c+a>b)
    {
        System.out.println("Triangle is possible");
        if (a==b&&b==c&&c==a)
        System.out.println("Equilateral Triangle!");
        else if (a==b||b==c||c==a)
        System.out.println("Isosceles Triangle!");
        else if (a!=b&&b!=c&&c!=a)
        System.out.println("Scalene Triangle!");
    }
    else
    System.out.println("Sorry,"+"\n"+"This triangle is not possible at all.");
    }
}