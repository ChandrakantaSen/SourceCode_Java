import java.io.*;
class Binary_search_ascend
{
public static void main(String args[])throws IOException
{
int i,j,t=0,n,k,mid,min,max,flag=0;
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
System.out.println("The values in the array after sorting are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the values to be searched from the array: - ");
k=Integer.parseInt(br.readLine());
min=0;
max=n-1;
mid=0;
while(min<=max)
{
mid=(max+min)/2;
if(a[mid]>k)
{
 max=mid-1;
    }
else if(a[mid]<k)
{
min=mid+1;
}
    else
    {
        flag=1;
        break;
    }
}
if(flag==1)
{
System.out.println(k+" is found in position "+(mid+1));
    }
    else
    {
        System.out.println(k+" is not found in the array.");
    }
}
    }
