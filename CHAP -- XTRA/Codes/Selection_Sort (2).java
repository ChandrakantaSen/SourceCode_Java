import java.io.*;
public class Selection_Sort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int i,j,max=0,t,n;
System.out.println("Enter the limit");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];

for(i=0;i<n;i++)
{
System.out.println("Enter the values in the array : ");
a[i]=Integer.parseInt(br.readLine());
}

for(i=0;i<n-1;i++)
{
max=i;
for(j=i+1;j<n;j++)
{
if(a[j]>a[max])
{
max=j;
}
}
t=a[i];
a[i]=a[max];
a[max]=t;
}
System.out.println("The values in the Descending Order are : ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}