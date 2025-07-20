import java.io.*;
class reverse_of_the_array
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,s=0;
double avgs=0;
int a[]={23,31,44,56,72,55};
System.out.println ("The values in the array are as follows : - ");
for (i=0;i<6;i++)
{
    System.out.println (a[i]);
}
System.out.println ("The reverse of the array are as follows : -");
for (i=6-1;i>=0;i--)
{
System.out.println (a[i]);
}
    }
}