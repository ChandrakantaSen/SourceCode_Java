class Prime_number
{
    public static void main(int n )
    {
        int c = 0;
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if (c==2)
        {
            System.out.println("prime numbers");
        }
        else
        {
            System.out.println("non prime numbers");
        }
    }
}

                 