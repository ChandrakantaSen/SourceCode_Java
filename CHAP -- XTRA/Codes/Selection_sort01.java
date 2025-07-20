import java.io.*;
class Selection_sort01
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,j,t;
System.out.println ("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println ("Enter the values in the array : - ");
for (i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println ("The values in the array are as follows : - ");
for (i=0;i<n;i++)
{
    System.out.println (a[i]);
}
for (i=0;i<n-1;i++)
{
for (j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
    }
}
    }
    System.out.println ("The values of the array after sorting as follows");
    for (i=0;i<n;i++)
    {
System.out.println (a[i]);
    }
}
    }