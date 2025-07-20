package Puspendu;

class prime
{
    public static void main()
    {
        int f=0;
        System.out.println("The first 50 prime numbers are :");
        int ctr=0;
        for(int i=0;ctr<50;i++)
        {f=0;
            for(int j=1;j<=i;j++)
            {
                
                if(i%j==0)
                f++;
            }
            if(f==2)
            {
            System.out.println(i+" ");
            ctr++;
        }
    }
    
}
}