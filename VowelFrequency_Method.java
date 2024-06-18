import java.util.*;
class VowelFrequency_Method
{
    void freq(String x)
    {
        int a=0,e=0,i=0,o=0,u=0;
        for (int k=0;k<x.length();k++)
        {
            char ch=x.charAt(k);
            if (ch=='A')
            a++;
            if (ch=='E')
            e++;
            if (ch=='I')
            i++;
            if (ch=='O')
            o++;
            if (ch=='U')
            u++;
        }
        System.out.println("\nFrequency of a or A : "+a);
        System.out.println("Frequency of e or E : "+e);
        System.out.println("Frequency of i or I : "+i);
        System.out.println("Frequency of o or O : "+o);
        System.out.println("Frequency of u or U : "+u);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        VowelFrequency_Method obj = new VowelFrequency_Method();
        obj.freq(s);
    }
}