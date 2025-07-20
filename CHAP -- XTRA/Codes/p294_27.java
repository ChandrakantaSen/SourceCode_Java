/*CHECKING WHETHER AN ENTERED NUMBER IS PRIME PERFECT OR NOT*/
import java.io.*;
class p294_27
{
public static void main(String args[])throws IOException
{
int i,n,s=0,j,c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check whether it is prime perfect or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
s=s+i;
}
}
}
if((s+1)==n)
{
System.out.println(n+"is a prime perfect number");
}
else
{
System.out.println(n+"is not a prime perfect number");
}
}
} 