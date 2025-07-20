import java.io.*;
class p7
{
public static void main(String args[])throws IOException
{
int i,j,t;
int a[]=new int[100];
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the values in the array : - ");
for(i=0;i<100;i++)
{
a[i]=Integer.parseInt(br.readLine());
    }
System.out.println("The values in the array are as follows : - ");
for(i=0;i<100;i++)
{
a[i]=Integer.parseInt(br.readLine());
    }
for(i=1;i<50;i++)
{
for(j=0;j<50-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
    }
    }
}
for(i=1;i<50;i++)
{
for(j=0;j<100-i;j++)
{
if(a[j]<a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
    }
    }
}    
System.out.println("The first fifty values in the array after bubble sort in ascending order are as follows : - ");
for(i=0;i<50;i++)
{
System.out.println(a[i]);
    }
System.out.println("The next fifty values in the array after bubble sort in decending order are as follows : - ");
for(i=51;i<100;i++)
{
System.out.println(a[i]);
    }    
    }
}