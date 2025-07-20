import java.io.*;
public class series
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int i,j,n,t;
System.out.println("Enter the size of the array");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if((a[i]<=0)&&(a[j]>=0))
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
