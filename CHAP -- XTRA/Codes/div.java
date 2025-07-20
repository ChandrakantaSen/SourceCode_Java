import java.io.*;
class div
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double d, a,b;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
d=a/b;
System.out.println("the quotient of "+a+" and "+b+ "is ="+d);
}
}
