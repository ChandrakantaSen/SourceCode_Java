import java.io.*;
class switchcase3
{
public static void main(String args[])throws IOException
{
int a,b,c;
 String d;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number  : ");
a=Integer.parseInt(buf.readLine());
System.out.println("Enter the second number  : ");
b=Integer.parseInt(buf.readLine());
System.out.println("Enter your choice ....press add for addition,sub for subtraction,mul for multiplication , div for division and remainder for finding remainder: ");
d=buf.readLine();
switch(d)
{
case "add":
c=a+b;
System.out.println("The addition result is = "+c);
break;
case "sub":
c=a-b;
System.out.println("The subtraction result is = "+c);
break;
case "mul":
c=a*b;
System.out.println("The multipication result is = "+c);
break;
case "div":
c=a/b;
System.out.println("The division result is = "+c);
break;
case "remainder":
c=a%b;
System.out.println("The remainder result is = "+c);
break;
default:
System.out.println("bhaiya english padh ke aao .");
break;
}
}
}