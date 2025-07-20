import java.io.*;
public class array_prime
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,j,c;
System.out.println("Enter the size of the arrays");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}

System.out.println("The prime numbers in the arrays are as follows");
for(i=0;i<n;i++)
{
c=0;
for(j=1;j<=a[i];j++)
{
        if(a[i]%j==0)
        {
c++;

}
}
if(c==2)
{
System.out.println(a[i]);
}
}
}
}
