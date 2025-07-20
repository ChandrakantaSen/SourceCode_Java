import java.io.*;
class Linear_Search
{
public static void main(String args[])throws IOException
{
int i,k,flag=0,n;
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
