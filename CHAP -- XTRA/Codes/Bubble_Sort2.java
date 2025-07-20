import java.io.*;
class Bubble_Sort2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,t;
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
    System.out.println("The values in the array after performing bubble sort  are :-");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
}
}