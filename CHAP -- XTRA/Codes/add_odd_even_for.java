import java.io.*;
class add_odd_even_for
{
public static void main(String args[])throws IOException
{
int i,n,s=0,se=0,so=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the range:");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
s=s+i;

if(i%2==0)
{
se=se+i;

}
else
{
so=so+i;
}
}
System.out.println("the sum of all numbers upto"+n+"="+s);
System.out.println("the sum of all even numbers upto"+n+"="+se);
System.out.println("the sum of all odd numbers upto"+n+"="+so);
}
}