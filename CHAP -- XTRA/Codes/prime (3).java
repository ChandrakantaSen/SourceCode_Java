class prime
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;

                }
            }
                if (c==2)
                {
                    System.out.println(i);
                }
            }
        }
    }
