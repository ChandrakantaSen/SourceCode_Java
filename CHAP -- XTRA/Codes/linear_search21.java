import java.io.*;
class linear_search21
{
public static void main(String args[])throws IOException
{
int i,n,k,flag=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the array:");
n=Integer.parseInt(br.readLine());

int a[]=new int[n];
System.out.println("Enter the numbers in the array are:");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("enter the number to be searched:");
k=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(a[i]==k)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println(k+"is found at the"+(i+1)+"th position");
}
}
}

