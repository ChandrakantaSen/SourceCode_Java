import java.io.*; 
class armstrng
{
public static void main(String args[])throws IOException
{
int i,k,c=0,n,p,m;
double s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number=");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
  {
      m=m/10;
      c=c+1;
    }
    m=n;
      while(m>0)
      {
      p=m%10;
      s=s+Math.pow(p,c);
      m=m/10;
    }
    if((int)(s)==n)
    {
      System.out.println(n+" is an amstrong number ");
    }
    else
    {
      System.out.println(n+" is not an amstrong number ");
    }
    }
}
