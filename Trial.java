public class Trial
{
    public static void main (int p)
    {
        int a=1,b=2,c=3;
        switch(p)
        {
            case 1:
            a++;
            case 2:
            ++b;
            break;
            case 3:
            c--;
        }
        System.out.println(a+","+b+","+c);
    }
}