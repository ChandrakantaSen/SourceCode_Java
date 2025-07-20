class j
{
    public static void main(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+ "is the biggest no");
        }
        if(c>a && b>c)
        {
            System.out.println(b+" is the biggest no");
            if(c>a && c>b)
            {
                System.out.println("the biggest no is " +c);
            }
        }
    }
}