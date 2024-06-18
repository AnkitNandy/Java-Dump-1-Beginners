/**This program is to find the 
 * area of an Equilateral Triangle,
 * an Isosceles Triangle, and
 * a Scalene Triangle.
 * It depends upon the user's choice.
 */
import java.util.*;
public class TrianglesArea
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float s,sp,a,b,m,n,p;//sp is semi-perimeter
        int choice;
        double area;
        System.out.println("1-Equilateral Triangle"+"\n"+"2-Isosceles Triangle"+"\n"+"3-Scalene Triangle");
        System.out.println("Press 1, 2 or 3 to find their areas.");
        System.out.println("Enter your choice:-");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the length of one side of equilateral triangle:-");
            s=sc.nextFloat();
            area=Math.sqrt((3.0)/(4.0))*s*s;
            System.out.println("Area of equilateral triangle is-"+"\n"+area+" square units.");
            break;
            case 2:
            System.out.println("Enter base of isosceles triangle:-");
            b=sc.nextFloat();
            System.out.println("Enter one of its equal sides:-");
            a=sc.nextFloat();
            area=(1.0/4.0)*b*Math.sqrt(4.0*a*a-b*b);
            System.out.println("Area of isosceles triangle is-"+"\n"+area+" square units.");
            break;
            case 3:
            System.out.println("Enter the three unequal sides of scalene triangle:-");
            m=sc.nextFloat();
            n=sc.nextFloat();
            p=sc.nextFloat();
            sp=(float)((m+n+p)/2.0);
            area=Math.sqrt(sp*(sp-m)*(sp-n)*(sp-p));
            System.out.println("Area of scalene triangle is-"+"\n"+area+" square units.");
            break;
            default:
            System.out.println("You might not have entered 1, 2 or 3!!");
            System.out.println("Wrong Choice.");
        }
    }
}