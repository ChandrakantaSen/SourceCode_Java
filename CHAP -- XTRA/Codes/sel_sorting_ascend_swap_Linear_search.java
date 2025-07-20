import java.io.*;
class sel_sorting_ascend_swap_Linear_search
{
public static void main(String args[])throws IOException
{
int i,j,n,k,flag=0;
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
a[i]=a[i]+a[j];
a[j]=a[i]-a[j];
a[i]=a[i]-a[j];
    }
}
    }
System.out.println("The values in the array after selection sort are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the values to be searched from the array : - ");
k=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(a[i]==k)
{
flag=1;
break;
    }
}
if(flag==1)
{
System.out.println(k+" is found in the position "+(i+1));
    }
    else
    {
        System.out.println(k+" is not found");
    }
}
}

