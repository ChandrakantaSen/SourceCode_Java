import java.io.*;
class arr_krish
{
public static void main(String args[])throws IOException
{
int b,n,m=1,s=0,y,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the array:");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the array are:");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The numbers in the array are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Krish numbers in the array are as follows:");
for(i=0;i<n;i++)
{
b=a[i];
s=0;
y=0;
do
{
y=b%10;
for(j=1;j<=y;j++)
{
m=m*j;
}
s=s+m;
m=1;
b/=10;
}
while(b>0);

if(s==a[i])

System.out.println(a[i]);
    }
}
}


