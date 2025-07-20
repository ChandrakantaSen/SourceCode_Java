import java .io.*;
public class Bubble_sort_with_Linear_search
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,j,t,k,flag=0;
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
for (i=1;i<n;i++)
{
for (j=0;j<n-i;j++)
{
if (a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
    }
}
    }
    System.out.println ("The values of the array after sorting as follows");
    for (i=0;i<n;i++)
    {
System.out.println (a[i]);
    }
System.out.println ("Enter the no. to be find in the array");
k=Integer.parseInt (br.readLine());
for (i=0;i<n;i++)
{
if (a[i]==k)
{
flag=1;
break;
    }
}
if (flag==1)
{
System.out.println (k+" is found at "+(i+1)+"th possision in the array ");
    }
    else
    {
        System.out.println ("The values not found");
    }
}
    }
  