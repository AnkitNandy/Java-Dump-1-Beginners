public class Try1
{
    public static void main()
    {
        int x=12;
        if (x++==1)
        System.out.print("RESULT IS 11");
        else if (++x==10)
        System.out.print("RESULT IS 10");
        else if (--x==10)
        System.out.print("RESULT IS 10");
        else
        System.out.print("RESULT IS NEITHER 10 NOR 11");
    }
}