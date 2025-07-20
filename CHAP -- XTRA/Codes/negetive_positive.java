import java.io.*;
class negetive_positive
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n,t=0;
System.out.println("Enter the size of the array");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The values in the array are as  follows");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(j=0;j<n;j++)
{
if(a[j]<0)
{
t=a[j];
for(i=j;i<n-1;i++)
{
a[i]=a[i+1];
    }
    t=0;
}
System.out.println("The new values in the array are as  follows");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
    }}}