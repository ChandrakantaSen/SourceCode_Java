class series
{
    public static void main(long n,long m)
    {
        long t=0,sum=0;
        for (long i=1;i<n;i++)
        {
            sum=sum+t;              
            t=t*10+m;
            System.out.println(" "+t); 
        }
        System.out.println("The Sum of The Upper Number is " +sum);
    }
}
        