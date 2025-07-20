import java.io.*;
class array10
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,m,d,s=0;
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
    System.out.println ("The reverse of the array as follows");
    for (i=0;i<n;i++)
    {
       s=0;
       for (m=a[i];m>0;m=m/10)
{
d=m%10;
s=s*10+d;
    }
    a[i]=s;
    System.out.println (a[i]);
}
    }
}