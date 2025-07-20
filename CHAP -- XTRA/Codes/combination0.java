import java.io.*;
class combination0
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,nd=0,m,s,p=0,d,k,t,x,fact=1,c=0;
System.out.println("Enter number to check for vampire no");
n=Integer.parseInt(br.readLine());
for(i=n;i>0;i=i/10)
{
nd++;
    }
    System.out.println(nd);
    t=n;
    for(i=1;i<=nd;i++)
    {
        fact=fact*i;
    }
    for(i=1;i<=fact;i++)
    {
             // System.out.println(t);
        s=0;
        m=t;
        while(m>0)
        {
            d=m%10;
            s=s*10+d;
            m=m/10;
        }
        m=s;
        while(m>0)
        {
            c++;
            m=m/10;
        }
       if(c==nd)
        {
        System.out.println(s);
        k=(int)(s%Math.pow(10,i));
        x=(int)(s/Math.pow(10,i));
        t=(int)(k*Math.pow(10,nd-i))+x;
        System.out.println(t);
    } 
    c=0;
}
}
    }