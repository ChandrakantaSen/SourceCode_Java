import java.io.*;
class cal
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,r;
char op;
System.out.println("\n enter first number:");
a=Double.parseDouble(br.readLine());
System.out.println("\n enter second number:");
b=Double.parseDouble(br.readLine());
System.out.println("\n enter operator:");
op=(char)br.read();
switch(op)
{
case '+':
System.out.println("\n addition result is:"+(r=a+b));
break;
case '-':
System.out.println("\n substraction result is:"+(r=a-b));
break;
case '*':
System.out.println("\n multiplication result is:"+(r=a*b));
break;
case '/':
System.out.println("\n division result is:"+(r=a/b));
break;
default:
System.out.println("\n invalid choice");
break;
}
}
}








