import java.io.*;
class binarysearch_bubblesort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,k,t,flag=0,min,max,mid;
System.out.println("\n Enter the size of the array:-");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("\n Enter the numbers in the array"+(i+1));
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("\n The sorted array is");
for(i=0;i<n;i++)
{
System.out.println(a[i]+"  ");
}
System.out.println("\n Enter a number to be searched:-");
k=Integer.parseInt(br.readLine());
min=0;
max=n-1;
mid=0;
while(min<=max)
{
mid=(max+min)/2;
if(k>a[mid])
{
min=mid+1;
}
else if(k<a[mid])
{
max=mid-1;
}
else
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println(k+"is found at position"+(mid+1));
}
else
{
System.out.println(k+"is not found");
}
}
}
