import java.io.*;
class array_sum_and_average
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
for (i=0;i<6;i++)
{
s=s+a[i];
        }
        System.out.println ("The sum of the array"+s);
        for (i=0;i<6;i++)
        {
            avgs=s/6;
        }
        System.out.println ("The average of the array "+avgs);
    }
}