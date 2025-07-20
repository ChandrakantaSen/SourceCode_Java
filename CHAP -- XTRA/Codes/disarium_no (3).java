import java.io.*;
public class disarium_no
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a,n,i,num,flag=0;double s;s=0;
System.out.println("Enter the no");
n=Integer.parseInt(br.readLine());
num=n;
for(i=1;i<n;i++)
{
a=n%10;
s=s+Math.pow(a,i);
n=n/10;
}
if(num==s)
{
flag=1;
}
if(flag==1)
{
System.out.println("It is a disarium no");
}
else
{
System.out.println("It is not a disarium no");
}
}
}
