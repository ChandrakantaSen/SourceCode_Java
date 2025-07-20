import java.io.*;
public class selection_sort_asc
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
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("The no in the arrays after selection sort are as follows");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

