package All;

class removeZero
{
    public static void main(int n)
    {
        int d=0,s=0,c=0;
        while(n!=0)
        {
            d=n%10;
            if(d!=0)
            {
                s=s+d*(int)Math.pow(10,c);
                c++;
            }
            n=n/10;
        }
        System.out.println("Number WithOut Zero 0 : "+s);
    }
}
       
    