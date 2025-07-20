import java.io.*;
public class linear_search
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,flag=0,k;
System.out.println("Enter the size of the arrays");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The numbers in the arrays are as followed");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the numbers to be searched in the array");

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
System.out.println(k+"is found at "+(i+1)+"th position in the array");
}
else
{
System.out.println(k+"is not found in the array");
}
}
}

