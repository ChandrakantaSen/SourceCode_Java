import java.io.*;
class fact_foorloop
{
public static void main(String args[])throws IOException
{
 int n,i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to print the factorial of that number");;
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
System.out.println(i);
}
}
}
}


