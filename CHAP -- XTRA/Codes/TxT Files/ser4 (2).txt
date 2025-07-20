//s=x1/1!-x2/2!+x3/3!-x4/4!+x5/5-+x6/6!.......xn/n!
import java.io.*;
import java.io.*;
import java.lang.*;
class ser4
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double s=0,y;
System.out.println("\n enter the of n ");
String z=br.readLine();
int n=Integer.parseInt(z);
System.out.println("\n enter the of x ");
String r=br.readLine();
int x=Integer.parseInt(r);
for(int a=1;a<=n;a++)
{
int p=1;
for(int j=1;j<=a;j++)
{
p=p*j;   
}
y=Math.pow(x,a)/p;
if(a%2==0)
s=s-y;
else
s=s+y;
}
System.out.println(s);
}
}