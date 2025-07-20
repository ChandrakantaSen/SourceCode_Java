import java.io.*;
class div1
{
public void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b;
double d;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
d=a/b;
System.out.println("The quotient  of "+a+" and "+b+"is ="+d);
}
}