import java.io.*;
class factorial_forloop
{
public static void main(String args[])throws IOException
{
 int n,i,fact=1;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find out the factorial of that number");;
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
fact=fact*i;
}
System.out.println("The factorial of +n+ is "+fact);
}
}

