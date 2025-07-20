//**wap to input the elements in the array and sort using insertion sort and find the given 
//**number using binary search**
import java.io.*;
class insertionndbinary_Sort2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,s,t=0,k,x,min,max=0,mid,flag=0;
System.out.println("Enter the size of the array : -");
s=Integer.parseInt(br.readLine ());
int a[]=new int[s];
System.out.println("Enter the numbers in an arrary: - ");
for(i=0;i<s;i++)
{
a[i]=Integer.parseInt(br.readLine ());
    }
System.out.println("The values in the array are as follows : -");  
for(i=0;i<s;i++)
    {
        System.out.println(a[i]);
    }
        for (i=0;i<s;i++)
{
for (int j=0;j<i;j++)
            {
                if (a[j]>a[i])
{
t=a[j];    
a[j]=a[i];
for (k=i;k>j;k--)
  a[k]=a[k-1];
a[k+1]=t;
    }
}
    }
    System.out.println(" The sorted array is:");
for(i=0;i<s;i++)
{
System.out.println(a[i]+"\t");
    }

//**starting of binary search**//
System.out.println("Enter the number to be searched from the array  :-");
x=Integer.parseInt(br.readLine());
min=0;
max=s-1;
mid=0;
while(min<=max)
{
mid=(min+max)/2;
if(a[mid]<x)
    {
        min=mid+1;
    }
else if(a[mid]>x)
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
        System.out.println(x+" is at "+(mid+1)+" position in the array");
    }
    else
    {
     System.out.println(x+" is not found  in the array.");   
}
}
}


