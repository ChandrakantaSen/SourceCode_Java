import java.io.*;
class bsrch_bsrt
{
public static void main()throws IOException
{
int i,j,flag=0,l,u,m=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no of elements in the array");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("enter elements of the array");
for(i=0;i<n;i++)
 a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
    for(j=0;j<n-1-i;j++)
    {
        if(a[j]>a[j+1])
        {
            a[j]=a[j]+a[j+1];
            a[j+1]=a[j]-a[j+1];
            a[j]=a[j]-a[j+1];
        }
    }
}
    System.out.println("Array in ascending order is");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
    l=0;
    u=n-1;
    while(l<=u)
    {
        m=(l+u)/2;
        if(n>a[m])
        l=m+1;
        else if(n<a[m])
        u=m+1;
        else
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    System.out.println("Element present at pos"+(m+1));
    else
    System.out.println("Element not present");
}
    }
    