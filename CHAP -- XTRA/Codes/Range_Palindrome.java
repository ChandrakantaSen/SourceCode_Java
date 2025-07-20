import java .io.*;
class Range_Palindrome
{
public static void main (String args[]) throws IOException
{
int i,n,m,d,s;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the range");
n=Integer.parseInt (br.readLine());
System.out.println (" The palindrome numbers upto " +n+ " are as follows ");
for (i=1;i<=n;i++)
{
m=i;
s=0;
while (m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    }
 if (s==i)
  {
    System.out.println (i);
}
    }
    }
}