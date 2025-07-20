import java .io.*;
class Range_Reverse
{
public static void main (String args[]) throws IOException
{
int i,n,m,d,s;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the range");
n=Integer.parseInt (br.readLine());
System.out.println (" The reverse numbers upto " +n+ " are as follows ");
for (i=1;i<=n;i++)
{
m=i;
s=0;
d=0;
while (m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    } 
   
        System.out.println (" The reverse of "+i+ " is " +s);
   }
    }
}