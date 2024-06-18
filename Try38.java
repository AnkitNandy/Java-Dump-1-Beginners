class Try38
{
    static void main()
    {
        int x=2,y=50;
        do
        {
            ++x;
            y-=x++;
        }
        while (x<=10);
        System.out.println(y);
    }
}