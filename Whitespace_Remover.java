import java.io.*;
class Whitespace_Remover
{
    static void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string to remove all of its whitespace :-");
        String s=in.readLine();
        System.out.println();
        System.out.println(s.trim());
    }
}