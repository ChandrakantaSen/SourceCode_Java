import java.io.*;
class mul
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,m;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
m=a*b;
System.out.println("The product of "+a+" and "+b+"is ="+m);
}
}
