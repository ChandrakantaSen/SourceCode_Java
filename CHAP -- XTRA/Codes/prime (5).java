import java.io.*;
class prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number");
int n=Integer.parseInt(br.readLine());
int i,j,c=0,c1=0;
System.out.println(" the prime nos after the entered number are as follows ");
for(i=n+1;;i++)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println(i);
c1=c1+1;
}
if(c1==2)
{
break;
}
}
c=0;
c1=0;
System.out.println(" the prime nos before the entered number are as follows ");
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println(i);
c1=c1+1;
}
if(c1==2)
{
break;
}
}
}
}