import java.io.*;
class add1
{
public void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
c=a+b;

System.out.println("The addition value of "+a+" and "+b+" is = "+c);
}
}