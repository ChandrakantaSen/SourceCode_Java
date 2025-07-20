import java.io.*;
class array6
{
public static void main (String args[]) throws IOException
{
BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
int i,n,j;
System.out.println ("Enter the size of the array ");
n=Integer.parseInt (br.readLine ());
int a[]=new int [n];
System.out.println ("Enter the values of the array");
for (i=0;i<n;i++)
{
a[i]=Integer.parseInt (br.readLine());
    }
    System.out.println ("The values in the array are as follows");
    for (i=0;i<n;i++)
      {
        System.out.println (a[i]);
    }
    System.out.println ("The prime no. in the array as follows"); 
    for (i=0;i<n;i++)
      {
       int   c=0;
for (j=1;j<=a[i];j++)
{
if (a[i]%j==0)
{
c++;
    }
}
if (c==2)
{
System.out.println (a[i]);
    }
    }
}
    }