import java.io.*;
class sub1
{
public void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,s;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
s=a-b;
System.out.println("The subtractional value  of "+a+" and "+b+"is ="+s);
}
}