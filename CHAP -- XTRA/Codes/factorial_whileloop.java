import java.io.*;
class factorial_whileloop
{
public static void main(String args[])throws IOException
{
 int n,i,fact=1;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find out its factorial");
n=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{
fact=fact*i;
i++;
}
System.out.println("The factorial of the entered number is"+fact);
}
}
