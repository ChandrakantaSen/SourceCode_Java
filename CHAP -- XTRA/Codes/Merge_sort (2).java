import java.io.*;
class Merge_sort
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,j,t,m,k;
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
System.out.println ("Enter the size of the array : - ");
m=Integer.parseInt(br.readLine());
int b[]=new int[m];
System.out.println ("Enter the values in the array : - ");
for (i=0;i<m;i++)
{
b[i]=Integer.parseInt(br.readLine());
}
System.out.println ("The values in the array are as follows : - ");
for (i=0;i<m;i++)
{
    System.out.println (b[i]);
}
for (i=0;i<m-1;i++)
{
for (j=i+1;j<m;j++)
{
if (b[i]>b[j])
{
t=b[i];
b[i]=b[j];
b[j]=t;
    }
}
    }
    System.out.println ("The values of the array after sorting as follows");
    for (i=0;i<m;i++)
    {
System.out.println (b[i]);
        }
        int c[]=new int [m+n];
        for (i=j=k=0;i<(m+n);)
        {
            if (a[i]>b[k])
            {
                c[i++]=b[k++];
            }
            else if (a[j]<b[k])
            {
                c[i++]=a[j++];
            }
            if ((j==n)||(k==m))
            {
                break;
            }
        }
        for (;j<n;)
        {
            c[i++]=a[j++];
        }
        for (;k<m;)
        {
            c[i++]=b[k++];
        }
        System.out.println ("The values of the array after sorting");
        for(i=0;i<m+n;i++)
        {
            System.out.println (c[i]);
        }
    }
}
            