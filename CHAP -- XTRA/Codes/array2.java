import java.io.*;
class array2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,min,max;
System.out.println("Enter the size of the array");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
min=a[0];
max=a[0];
System.out.println("Enter the values in the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());

    }
System.out.println("The values in the array are as follows");
for(i=0;i<n;i++)
{  
System.out.println(a[i]);
    }
for(i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
    }
    if(a[i]<min)
{
min=a[i];
    }
}
System.out.println("The maximum value in array"+max);
System.out.println("The minimum value in array"+min);
    }
}