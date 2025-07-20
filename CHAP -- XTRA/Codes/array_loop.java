import java.io.*;
class array_loop
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
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
System.out.println("The reverse  of numbers given in an array are as follows: -");
for(i=n-1;i>=0;i--)
{
System.out.println(a[i]);
    }

   
}
    }
