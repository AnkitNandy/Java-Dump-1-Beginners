class Try30
{
    public static void main()
    {
        int i=0,a,b,c;
        a=b=c=0;
        for (i=1;i<=5;i++)
        {
            switch(i)
            {
                case 1:
                a++;
                case 2:
                default:
                case 3:
                b++;
                case 6:
                break;
            }
            System.out.println(a+" "+b+" "+c);
        }
    }
}