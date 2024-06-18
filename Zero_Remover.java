class Zero_Remover
{
    public static void main(int num)
    {
        String s = Integer.toString(num);
        String str = "";
        System.out.println("After removing all zeros from "+num+", we get :");
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch=='0')
            str = str+"";
            else
            str = str+ch;
        }
        System.out.println(Integer.valueOf(str));
    }
}