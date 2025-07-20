import java.io.*;
class array_Amstrong extends negative2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,d,m,s;
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
System.out.println("The amstrong numbers in the array are as follows: -");
for(i=0;i<n;i++)
{
s=0;
d=0;
m=a[i];
while(m>0)
{
d=m%10;
s=s+(d*d*d);
m=m/10;
    }
if(s==a[i])
{
        System.out.println(a[i]);   
    }
}
    }
}