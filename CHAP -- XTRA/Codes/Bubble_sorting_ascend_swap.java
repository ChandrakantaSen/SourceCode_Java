import java.io.*;
class Bubble_sorting_ascend_swap
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.println("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array : - ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The values in the array are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=1;i<n;i++)
{
for(j=0;j<n-i;j++)
{
if(a[j]>a[j+1])
{
a[j]=a[j]+a[j+1];
a[j+1]=a[j]-a[j+1];
a[j]=a[j]-a[j+1];
    }
}
    }
System.out.println("The values in the array after Bubble sort are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
    }
