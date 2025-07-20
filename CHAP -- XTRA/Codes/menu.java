import java.io.*;
class menu
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,ch;
System.out.println("enter choice");
ch=Integer.parseInt(br.readLine());
System.out.println("enter first number");
a=Integer.parseInt(br.readLine());
System.out.println("enter second number");
b=Integer.parseInt(br.readLine());

switch(ch)
{
case 1:c=a+b;
System.out.println(c);
break;
case 2:c=a-b;
System.out.println(c);
break;
case 3:c=a*b;
System.out.println(c);
break;
case 4:c=a/b;
System.out.println(c);
break;
default:System.out.println("wrong choice");
    }
}
    }
