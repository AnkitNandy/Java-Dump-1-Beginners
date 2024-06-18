import java.util.*;
class Triplet
{
    int a,b,c;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers line by line:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
    void findprint()
    {
        Scanner sc=new Scanner(System.in);
        int x=(a*a)+(b*b);
        int y=(b*b)+(c*c);
        int z=(c*c)+(a*a);
        if ((x==(c*c)) || (y==(a*a)) || (z==(b*b)))
        System.out.println("\n"+a+", "+b+" and "+c+" are Pythagorean Triplets.");
        else
        System.out.println("\n"+a+", "+b+" and "+c+" are not Pythagorean Triplets at all!!");
    }
    public static void main()
    {
        Triplet obj=new Triplet();
        obj.getdata();
        obj.findprint();
    }
}