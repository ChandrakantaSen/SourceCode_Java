class pascal
{
    static void main(long n)
    {
        long i,k=1,j;
        for(i=1;i<=n;i++)
        {   for(j=1;j<=n-i+1;j++)
            System.out.print(" ");
            for(long l=k;l>0;l/=10)
            System.out.print(l%10+" ");
            System.out.println();
            k=k*10+k;
    }
}
    }