class dec_2_bin
{
    public static void main(int n)
    {
        int d,a=1,m=0;
        while(n!=0)
        {
            d=n%2;
            m=m+d*a;
            n=n/2;
            a=a*10;
        }
        System.out.println("Binary is: "+ m);
    }
}