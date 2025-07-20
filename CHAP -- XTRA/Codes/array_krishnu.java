import java.io.*;
class array_krishnu
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,d,m,s,fact;
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
System.out.println("The krishnamurti numbers in the array are as follows: -");
for(i=0;i<n;i++)
{
m=a[i];
d=0;
s=0;
while(m>0)
{
d=m%10;
fact=1;
for(int j=1;j<=d;j++)
{
fact=fact*j;
    }
    s=s+fact;
    m=m/10;
}
if(s==a[i])
{
        System.out.println(a[i]);   
    }
}
    }
}