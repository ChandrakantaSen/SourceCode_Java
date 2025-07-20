import java.io.*;
class arr_amstrong
{
public static void main(String args[])throws IOException
{
int n,q,r,s,i;
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
System.out.println("Amstrong numbers in the arr are as follows;-");
for(i=0;i<n;i++)
{
q=a[i];
r=0;
s=0;
while(q>0)
{
r=q%10;
s=(r*r*r)+s;
q=q/10;
}
if(s==a[i])
{
System.out.println(a[i]);
}
}
}
}
