/**To find the volume of 
 * a cube, a sphere and a cube.
 * It will depend upon the
 * user's choice.
 * For an incorrect choice,
 * an appropriate error message 
 * should be displayed!
 */
import java.util.*;
public class Volume
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float s,r,l,b,h,vr,vh;
        /*s - side of cube
         *r - radius of sphere
         *l - length of cuboid
         *b - breadth of cuboid
         *h - height of cuboid
         *vr - radius of cylinder
         *vh - height of cylinder
         */
        double vol;
        int c;//c - choice
        System.out.println("0-Exit the screen"+"\n"+"1-Volume of a cube"+"\n"+"2-Volume of a sphere"+"\n"+"3-Volume of a cuboid"+"\n"+"4-Volume of a cylinder");
        System.out.println("Press 0, 1, 2, 3 or 4 for these options:-");
        c=sc.nextInt();
        switch(c)
        {
            case 0:
            System.exit(0);
            case 1:
            System.out.println("Volume of cube???");
            System.out.println("Enter a side of cube:-");
            s=sc.nextFloat();
            vol=s*s*s;
            System.out.println("The volume of the cube of side "+s+" is-"+"\n"+vol);
            break;
            case 2:
            System.out.println("Volume of sphere???");
            System.out.println("Enter radius of sphere:-");
            r=sc.nextFloat();
            vol=(4.0/3.0)*(22.0/7.0)*r*r*r;
            System.out.println("The volume of the sphere of radius "+r+" is-"+"\n"+vol);
            break;
            case 3:
            System.out.println("Volume of cuboid???");
            System.out.println("Enter length, breadth and height of cuboid:-");
            l=sc.nextFloat();
            b=sc.nextFloat();
            h=sc.nextFloat();
            vol=l*b*h;
            System.out.println("The volume of the cuboid(length="+l+", breadth="+b+" and height="+h+" is-");
            System.out.println(+vol);
            break;
            case 4:
            System.out.println("Volume of cylinder???");
            System.out.println("Enter radius of the cylinder:-");
            vr=sc.nextFloat();
            System.out.println("Enter height of the cylinder:-");
            vh=sc.nextFloat();
            vol=(22.0/7.0)*vr*vr*vh;
            System.out.println("The volume of cylinder of radius "+vr+" and height "+vh+" is-");
            System.out.println(+vol);
            break;
            default:
            System.out.println("Wrong choice Entered!!!!");
            System.out.println("You must enter either 1, 2 or 3");
        }
    }
}
        