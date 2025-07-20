import java.io.*;
class palindrome_arr
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,n,m,d,s;
System.out.println("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array : - ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The values in the array are as follows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("The palindrome numbers in the array are as follows : - ");
for(i=0;i<n;i++)
{
m=a[i];
d=0;
s=0;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
}
    if(s==a[i])
    {
    System.out.println(a[i]);
}
}
    }
}
