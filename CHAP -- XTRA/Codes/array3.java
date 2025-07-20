import java.io.*;
class array3
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n;
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
System.out.println ("The even numbers in the array are as follows : - ");
for (i=0;i<n;i++)
{
if(a[i]%2==0)
{
   System.out.println (a[i]);
}
}
    }
}