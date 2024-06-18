class Try13
{
    public static void main()
    {
        String s="Hello, Hello, I am Ankit";
        System.out.println(s.indexOf('l'));//2
        System.out.println(s.indexOf("am"));//16
        System.out.println(s.indexOf('l',5));//9
        System.out.println(s.indexOf("lo",3));//3
        System.out.println(s.lastIndexOf('l'));//10
        System.out.println(s.lastIndexOf("e"));//8
    }
}