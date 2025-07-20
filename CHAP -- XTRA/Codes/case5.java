import java.io.*;
class case5
{
public void main (int a,int b,char ch)
{
int c=0;

switch(ch)
{
case '+':c=a+b;
System.out.println(c);
break;
case '-':c=a-b;
System.out.println(c);
break;
case '*':c=a*b;
System.out.println(c);
break;
case '/':c=a/b;
System.out.println(c);
break;
default:System.out.println("wrong choice");
}
}
}
