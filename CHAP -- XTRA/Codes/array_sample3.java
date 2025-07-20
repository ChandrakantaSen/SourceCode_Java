import java.io.*;
public class array_sample3
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n;
System.out.println("Enter the size of the arrays");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

