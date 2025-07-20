import java.io.*;
class xm_prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,n,m,d,s,j,t;
System.out.println("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array : - ");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("The values in the array are as follows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
} 
for(i=0;i<n;i++)
{
t=0;
for(j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{
t=t+1;
    }
}
{
if(t==2)
{
System.out.println("The prime no.s in the array are as follows : -" +a[i]);
    }
}
    }
}
    }
