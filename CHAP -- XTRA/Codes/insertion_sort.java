import java.io.*;
class insertion_sort
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,j,t,k;
System.out.println ("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println ("Enter the values in the array : - ");
for (i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for (i=0;i<n;i++)
{
for (j=0;j<i;j++)
{
if (a[j]>a[i])
{
t=a[j];
a[j]=a[i];
for (k=i;k>j;k--)
a[k]=a[k-1];
a[k+1]=t;
    }
}
    }
    System.out.println ("The values of the array after sorting is as follows");
    for (i=0;i<n;i++)
    {
     System.out.println (a[i]+" ");
    }
}
    }
