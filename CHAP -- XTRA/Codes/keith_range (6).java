import java.io.*;
class keith_range
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=0,p=0,s=0,f=0,l=0,i=0,n,low,upp;
        System.out.println("Enter upper & lower limits  : ");
        low=Integer.parseInt(br.readLine());
        upp=Integer.parseInt(br.readLine());
        for(n=low;n<=upp;n++)
        {
            if(n%10!=0)
            {
            int copy=n;
        while(copy>0)
        {
            c=copy%10;
            p=p*10+c;
            s=s+c;
            copy=copy/10;
        }
        f=p%10;
        p=p/10;
        l=s;
        while(i<n)
        {
            i=l*2-f;
            l=i;
            if(p>0)
            {
                f=p%10;
                p=p/10;
            }
            else
            f=s;
        }
        if(i==n)
        System.out.println(i+" is a keith number");
        p=0;s=0;i=0;
       }
    }
}
}