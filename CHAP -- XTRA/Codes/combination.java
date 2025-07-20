import java.io.*;
class combination
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,nd=0,m,s,p=0,d,k,t,x;
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
             // System.out.println(t);
        s=0;
        m=t;
        while(m>0)
        {
            d=m%10;
            s=s*10+d;
            m=m/10;
        }
        System.out.println(s);
        k=(int)(s%Math.pow(10,i));
        x=(int)(s/Math.pow(10,i));
        t=(int)(k*Math.pow(10,nd-i))+x;
        System.out.println(t);
    }
}
    }