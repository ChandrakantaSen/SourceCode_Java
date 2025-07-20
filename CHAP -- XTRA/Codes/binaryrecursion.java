import java.io.*;
class binaryrecursion
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int a[]=new int[100];
public static void main(String args[])throws IOException
{
int n,res=0,i,l,h,j,k,p,q,temp;
l=0;
System.out.println("Enter the number of elements:");
h=Integer.parseInt(br.readLine());
n=h;
System.out.println("Enter the values in the array :");
for(p=0;p<n;p++)
{
a[p]=Integer.parseInt(br.readLine());
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
    }
System.out.println("The values in the array after sorting is as follows :");
for(p=0;p<n;p++)
{
System.out.println(a[p]);
}
System.out.println("Enter the element to find:");
k=Integer.parseInt(br.readLine());
res=binsrec(k,l,h-1);
if(res==0)
{
System.out.println("Element not found");
    }
else
{
System.out.println("Element found");
    }
}
static int binsrec(int x,int ll,int hh)
{
int mid,re=0;
mid=(ll+hh)/2;
if(x==a[mid])
{
re=1;
    }
else
{
if(x<a[mid])
{
hh=mid-1;
re=binsrec(x,ll,hh);
}
else if(ll<=hh)
{
re=0;
    }
else if(x>a[mid])
{
ll=mid+1;
re=binsrec(x,ll,hh);
}
}
return re;
} 
    }