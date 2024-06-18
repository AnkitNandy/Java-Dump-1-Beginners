class try43
{
    static void main()
    {
        int a=4,b=17;
        while (a!=b)
        {
            if (a>b)
            a = a-b;
            else
            a = b-a;
        }
        System.out.println(a);
    }
}