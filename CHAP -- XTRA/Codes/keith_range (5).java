import java.io.*;
class keith_range
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,d,s=0,r=0,i,t,p,x,m,u,l,z;
System.out.println("Enter range to find keith no");
System.out.println("Enter lower limit");
l=Integer.parseInt(br.readLine());
System.out.println("Enter upper limit");
u=Integer.parseInt(br.readLine());
for(z=l;z<=u;z++)
{s=0;r=0;
n=z;
for(i=n;i>0;i=i/10)
{
d=i%10;
r=r*10+d;
s=s+d;
    }m=s;
    t=r;
    while(r>0)
    {
        d=r%10;
        s=s*2-d;
        r/=10;
        if(s==n)
        break;
    }
    if(s!=n)
    {
    s=s*2-m;
}
    while(s<n)
    {
        d=t%10;
        m=m*2-d;
        s=s*2-m;
        t=t/10;
    }
    if(s==n)
    System.out.println(n+" is a keith no");
}
    }
}