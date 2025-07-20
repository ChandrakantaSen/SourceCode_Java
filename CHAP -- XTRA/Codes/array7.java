import java.io.*;
class array7
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,j,s=0;
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
    System.out.println ("The perfect no. of array as follows");
    for (i=0;i<n;i++)
    {
    s=0;
      for (j=1;j<a[i];j++)
      {
          if (a[i]%j==0)
          {
              s=s+j;
            }
        }
           if (s==a[i]);
        }
        System.out.println (a[i]);
    }
}

