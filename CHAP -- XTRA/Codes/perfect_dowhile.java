import java.io.*;
class perfect_dowhile
{
public static void main(String args[])throws IOException
{
int i=1,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check wheather it is perfect or not :");
n=Integer.parseInt(buf.readLine());
do
{
if(n%i==0)
{
s=s+i;
}
i++;
}
while(i<n);
if(s==n)
{
System.out.println(n+" is a perfect number ");
}
else
{
System.out.println(n+" is not a perfect number ");
}
}
}