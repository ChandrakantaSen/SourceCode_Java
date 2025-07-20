import java.io.*;
class Karpekar1	
{
public static void main(String args[])throws IOException
{
int n,m,s,i;
int d=1;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is karpekar or not:");
n=Integer.parseInt(buf.readLine());
s=n*n;
m=n;
while(m>0)
{
d=d*10;
m=m/10;
}
if(((s%d)+(s/d))==n)
{
System.out.println(n+" is a karpekar number .");
}
else
{
System.out.println(n+" is not a karpekar number .");
}
}
}