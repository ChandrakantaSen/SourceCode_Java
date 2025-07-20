import java.io.*;
class Smith
{
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int m,n,s=0,d,q,f,i,c;
    public static void main()throws IOException
    {
        System.out.println("Enter a number : ");
        n=Integer.parseInt(br.readLine());
        m=n;
        f=n;
        while(m>0)
        {
            d=m%10;
            s=s+d;
            m=m/10;
        }
        System.out.println(s);
        c=0;
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                int p=i;
                int s1=0;
                if(i>9)
                {
                    while(p>0)
                    {
                        d=p%10;
                        s1=s1+d;
                        p=p/10;
                    }
                    c=c+s1;
                }
                else
                {
                    c=c+i;
                    d=n/i;
                    n=d;
                    if(i!=2)
                    i--;
                }
            }
        }
        System.out.println(c);
        if(s==c)
        System.out.println(f+" is a Smith Number ");
        else
        System.out.println(f+" is not a Smith Number ");
    }
}