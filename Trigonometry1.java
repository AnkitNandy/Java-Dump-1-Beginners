import java.util.*;
class Trigonometry1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("!@#$%^&*WELCOME TO TRIGONOMETRY STATION*&^%$#@!");
        System.out.println("\nEnter an angle (in degrees):");
        double a=sc.nextInt();
        double rad = 22.0/(7.0*180.0)*a;
        System.out.println();
        System.out.println("Sine "+a+" = "+Math.sin(rad));
        System.out.println("Cos "+a+" = "+Math.cos(rad));
        System.out.println("Tan "+a+" = "+Math.tan(rad));
        System.out.println("Cosec "+a+" = "+(1.0/Math.sin(rad)));
        System.out.println("Sec "+a+" = "+(1.0/Math.cos(rad)));
        System.out.println("Cot "+a+" = "+(1.0/Math.tan(rad)));
        System.out.println("\n========THE END========");
    }
}