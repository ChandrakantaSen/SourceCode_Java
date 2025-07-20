class htop
{
    public static void main(String args[])
    {
        int i,j,b=0,a=11;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
               b=a;
               System.out.print(a+" ");
                a=a-1;
            }
            a=b;
            System.out.println( );
        }
    }
}
