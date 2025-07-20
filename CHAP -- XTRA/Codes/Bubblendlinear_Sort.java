//**enter the elements in the array and sort using bubble sort nd find a given number using lonear search**\\
import java.io.*;
class Bubblendlinear_Sort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,t,k,flag=0;
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
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1 ]=t;
    }
}
    }
    System.out.println("The values in the array after bubble sorting are :-");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
System.out.println("Enter any value to be searched :-");
k=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(k==a[i])
{
flag=1;
break;
    }
}
if(flag==1)
{
System.out.println(k+" is found at "+(i+1)+"th position in the array.");
    }
    else
    {
        System.out.println(k+" is not found in the array.");
    }

}
}
