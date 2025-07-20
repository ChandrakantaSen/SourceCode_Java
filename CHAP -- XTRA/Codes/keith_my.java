//    Keith number with my method ////
import java.io.*;
class keith_my
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=0,p=0,s=0,f=0,l=0,i=0,n,low,upp;
        System.out.println("Enter upper & lower limits  : ");
        n=Integer.parseInt(br.readLine());
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
            i=l+(l-f);
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
        else 
        System.out.println(i+"is not a keith number ");
    }
}