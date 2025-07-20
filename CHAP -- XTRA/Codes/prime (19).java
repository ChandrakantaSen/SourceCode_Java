class prime
{
    public static void main(String args[])
    {
        int k,i,j;
        for(i=2;i<=100;i++)
        {
            k=0;
            for(j=2;j<=i;j++)
            {
                if(i%j==0 && j!=1 && j!=i)
                {
                    k=1;
                }
            }
            if(k==0)
            System.out.println(i);
        }
    }
}

