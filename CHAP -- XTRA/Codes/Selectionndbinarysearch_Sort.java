//**enter the elements in the array and sort using selection sort**\\   
import java.io.*;
class Selectionndbinarysearch_Sort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,t,k,flag=0,min,max=0,mid;
System.out.println("Enter the size of the array : -");
n=Integer.parseInt(br.readLine ());
int a[]=new int[n];
System.out.println("Enter the numbers in an arrary: - ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine ());
    }
System.out.println("The values in the array are as follows : -"); 
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
    System.out.println("The values in the array after performing selection sort are :-");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }

//**starting of binary search**//
System.out.println("Enter the number to be searched from the array  :-");
k=Integer.parseInt(br.readLine());
min=0;
max=n-1;
mid=0;
while(min<=max)
{
mid=(min+max)/2;
if(a[mid]<k)
    {
        min=mid+1;
    }
else if(a[mid]>k)
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
        System.out.println(k+" is at "+(mid+1)+" position in the array");
    }
    else
    {
     System.out.println(k+" is not found  in the array.");   
}
}
}
