import java.io.*;
class array_magic
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,d,m,s=0;
System.out.println("Enter the range: -");
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
System.out.println("The magic numbers in the array are as follows: -");
for(i=1;i<n;i++)
{
s=0;
m=a[i];
for(;m>0;m=m/10)
{
d=m%10;
s=s+d;
    }
if((s==10)||(s==1))
{    
        System.out.println(a[i]);   
    }
}
    }
}