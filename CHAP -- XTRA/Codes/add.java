       
import java.io.*;
class add
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,d,m,s;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println("The addition value of "+a+" and "+b+" is = "+c);
d=a/b;
System.out.println("the quotient of "+a+"and"+b+"is ="+d);
m=a*b;
System.out.println("The product value of "+a+" and "+b+" is = "+m);
s=a-b;
System.out.println("The  difference between "+a+" and "+b+" is = "+s);
}
}