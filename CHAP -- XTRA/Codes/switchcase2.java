import java.io.*;
class switchcase2
{
public static void main(String args[])throws IOException
{
int a,b,c,d;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("PRESS 1 FOR ADDITION ");
System.out.println("PRESS 2 FOR SUBTRACTION ");
System.out.println("PRESS 3 FOR MULTIPICATION ");
System.out.println("PRESS 4 FOR DIVISION ");
System.out.println("PRESS 5 FOR REMAINDER ");
System.out.println("PRESS 6 FOR EXIT ");
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
case 6:
System.exit(0);
break;
default:
System.out.println("Sorry you have entered a wrong choice .");
break;
}
}
while(d>0);
}
}