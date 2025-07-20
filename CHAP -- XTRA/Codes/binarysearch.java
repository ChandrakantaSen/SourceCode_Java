import java.io.*;
class binarysearch
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,temp,i,j,k,min=0,mid,max,flag=0;
int a[]={2,14,17,25,32,34,64,128,256,500};
 System.out.println("The values in the array after bubble sort are as follows : - ");
            for(i=0;i<10;i++)
            {
             System.out.println(a[i]);
            }
 System.out.println("Enter the value to be searched from the array  : - ");            
 k=Integer.parseInt(br.readLine());
min=0;
max=9;
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
System.out.println(k+"is found at "+(mid+1)+"th position in the array");
    }
    else
    {
System.out.println(k+"is not found");
    }
}
    }