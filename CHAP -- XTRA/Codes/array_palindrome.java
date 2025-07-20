import java.io.*;
public class array_palindrome
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,j,s,d;
System.out.println("Enter the size of the arrays");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}

System.out.println("The palindrome numbers in the arrays are as follows");
for(i=0;i<n;i++)
{
s=0;
for(j=a[i];j>0;j++)
{
d=j%10;
s=s*10+d;
}
if(s==a[i])
{
System.out.println(a[i]);
}
}
}
}



