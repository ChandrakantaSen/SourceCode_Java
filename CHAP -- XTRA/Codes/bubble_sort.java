import java.io.*;
public class bubble_sort
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,t=0,j;
System.out.println("Enter the size of the arrays");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The numbers in the arrays are as followed");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=1;i<n;i++)
{
for(j=0;j<n-i;j++)
{
if(a[j]>a[j+i])
{
t=a[j];
a[j]=a[j+1];
a[j+i]=t;
}
}
}
System.out.println("The no in the arrays after bubble sort are as follows");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

