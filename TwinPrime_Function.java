import java.util.*;
class TwinPrime_Function
{
    int twin(int n)
    {
        int f=0,cnt=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            cnt++;
        }
        if (cnt==2)
        f=1;
        return f;
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to check if they are twin primes:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        TwinPrime_Function obj=new TwinPrime_Function();
        int x=obj.twin(a);
        int y=obj.twin(b);
        if (x==1 && y==1)
        {
            if (a-b==2 || b-a==2)
            System.out.println(a+" and "+b+" are Twin Prime Numbers.");
        }
        else
        System.out.println("Not Twin Primes!!");
    }
}