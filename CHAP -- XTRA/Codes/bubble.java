import java.io.*;
class bubble
{
public static void main(String arsg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,t,max,min,mid,flag=0,k;
System.out.println("enter the size of the array");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("enter the numbers in the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
    }
    
 System.out.println(" the numbers in the array are-:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
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
System.out.println("Enter the number to be searched in the array : - ");
k=Integer.parseInt(br.readLine());
System.out.println("The numbers in the array after sorting are as follows -:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
    } 
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
System.out.println(k+" is found at "+(mid+1)+"th position ");
    }
    else
{
System.out.println(k+" is not found the array . ");
    }    
}
    }



