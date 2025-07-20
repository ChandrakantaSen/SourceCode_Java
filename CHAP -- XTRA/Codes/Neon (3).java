class Neon
{
    public static void main(int n)
    {
        int p=0,b=0,c=0,sum=0;
        p=n*n;
        while(p>0)
        {
            b=p%10;
            sum=sum+b;
            p=p/10;
        }
        System.out.println("value is: "+sum);
        System.out.println("value is: "+p);
        if (sum==n)
        {
            System.out.println(n+" is a neon nuber");
        }
        else
        {
            System.out.println(n+" is not a neon number");
        }
    }
}

        
        