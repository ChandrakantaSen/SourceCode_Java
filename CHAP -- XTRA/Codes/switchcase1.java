import java.io.*;
class switchcase1
{
public static void main(String args[])throws IOException
{
int a,b,c;
char d;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number  : ");
a=Integer.parseInt(buf.readLine());
System.out.println("Enter the second number  : ");
b=Integer.parseInt(buf.readLine());
System.out.println("Enter your choice  : ");
d=(char)(buf.read());
switch(d)
{
case '+':
c=a+b;
System.out.println("The addition result is = "+c);
break;
case '-':
c=a-b;
System.out.println("The subtraction result is = "+c);
break;
case '*':
c=a*b;
System.out.println("The multipication result is = "+c);
break;
case '/':
c=a/b;
System.out.println("The division result is = "+c);
break;
case '%':
c=a%b;
System.out.println("The remainder result is = "+c);
break;
default:
System.out.println("Sorry you have entered a wrong choice .");
break;
}
}
}