import java.io.*;
public class bitwise_and
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int a,b,c;
System.out.println("Enter the first number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number : - ");
b=Integer.parseInt(br.readLine());
c=a&b;
System.out.println(c);
}
}