class automorphic
{
    public static void main(int a)
    {
        int s,n=a,c=0;
        s=a*a;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        double p= s%Math.pow(10,c);
        if((int)p==a)
        {
            System.out.println(a+" is an automorphic number");
        }
        else
        {
            System.out.println(a+" is not an automorphic number");
        }
    }
}