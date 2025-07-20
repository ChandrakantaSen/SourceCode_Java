import java.io.*;
class factorial_dowhile
{
public static void main(String args[])throws IOException
{
 int n,i,fact=1;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find out its factorial");
n=Integer.parseInt(br.readLine());
i=1;
do
{
fact=fact*i;
i++;
}
while(i<=n);
{
System.out.println("The factorial of the entered number is"+fact);
}
}
}
