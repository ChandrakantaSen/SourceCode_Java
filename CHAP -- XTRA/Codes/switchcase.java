import java.io.*;
class switchcase
{
public static void main(String args[])throws IOException
{
int a,b,c,d;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number  : ");
a=Integer.parseInt(buf.readLine());
System.out.println("Enter the second number  : ");
b=Integer.parseInt(buf.readLine());
System.out.println("Enter your choice  : ");
d=Integer.parseInt(buf.readLine());
switch(d)
{
case 1:
c=a+b;
System.out.println("The addition result is = "+c);
break;
case 2:
c=a-b;
System.out.println("The subtraction result is = "+c);
break;
case 3:
c=a*b;
System.out.println("The multipication result is = "+c);
break;
case 4:
c=a/b;
System.out.println("The division result is = "+c);
break;
case 5:
c=a%b;
System.out.println("The remainder result is = "+c);
break;
default:
System.out.println("Sorry you have entered a wrong choice .");
break;
}
}
}