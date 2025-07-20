/*               SERIES
a/2!+10!-a/4!+9!-a/6!+8!..............TO n terms*/
import java.io.*;
class p296_3i
{
public static void main(String args[])throws IOException
{
int a,i,n,j,k,l,fact=1,fact0=1;
double s=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the value of a");
a=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
j=2;
k=10;
for(l=1;l<=j;l++)
{
fact=fact*l;
}
for(l=1;l<=k;l++)
{
fact0=fact0*l;
}
if(i%2==0)
{
s=(s-a/fact+fact0);
}
else
{
s=(s+a/fact+fact0);
}
j=j+2;
k--;
}
System.out.println(s);
}
}