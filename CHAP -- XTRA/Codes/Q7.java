class Q7
{
    public static void main()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j>=1;j--)
            {
                if(j%2==0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
                
            }
            System.out.println();
        }
    }
}
