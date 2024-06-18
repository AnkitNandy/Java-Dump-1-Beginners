import java.util.*;
class Volume_Overload
{
    void volume(float s)
    {
        float vc=0.0F;
        System.out.println("\nVolume of cube:");
        vc = s*s*s;
        System.out.println(vc+" cube units.");
    }
    void volume(double r)
    {
        double vs=0.0;
        System.out.println("\nVolume of sphere:");
        vs = (4.0/3.0)*(22.0/7.0)*r*r*r;
        System.out.println(vs+" cube units.");
    }
    void volume(double l,double b,double h)
    {
        double vcd=0.0;
        System.out.println("\nVolume of spere:");
        vcd = l*b*h;
        System.out.println(vcd+" cube units.");
    }
    public static void main()
    {
        Volume_Overload obj = new Volume_Overload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of cube:");
        float side=sc.nextFloat();
        obj.volume(side);
        System.out.println("\nEnter the radius of sphere:");
        double rad = sc.nextDouble();
        obj.volume(rad);
        System.out.println("\nEnter the length, breadth and height of cuboid line by line:");
        double len=sc.nextDouble();
        double breadth=sc.nextDouble();
        double ht=sc.nextDouble();
        obj.volume(len,breadth,ht);
    }
}