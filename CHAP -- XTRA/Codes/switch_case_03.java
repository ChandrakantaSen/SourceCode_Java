import java.io.*;
class switch_case_03
{	
public static void main (String args[]) throws IOException
{
int a,b,c,ch;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("CALCULATER");
System.out.println ("Enter the first number : - ");
a=Integer.parseInt (br.readLine());
System.out.println ("Enter the second number : - ");
b=Integer.parseInt (br.readLine());
System.out.println ("Press 1. for Addition");
System.out.println ("Press 2. for Subtration");
System.out.println ("Press 3. for Multiplication");
System.out.println ("Press 4. for Division");
System.out.println ("Press 5. for Remainder");
System.out.println ("Enter your choice");
ch=Integer.parseInt (br.readLine());
switch(ch)
{
case 1:
c=a+b;

System.out.println ("The addition values of "+a+" and "+b+" is : - "+c);
break;
case 2:
c=a-b;
System.out.println ("The subtraction values of "+a+" and "+b+" is : - "+c);
break;
case 3:
c=a*b;
System.out.println ("The multiplication values of "+a+" and "+b+" is : - "+c);
break;
case 4:
c=a/b;
System.out.println ("The division values of "+a+" and "+b+" is : - "+c);
break;
case 5:
c=a%b;
System.out.println ("The remainder values of "+a+" and "+b+" is : - "+c);
break;
default:
System.out.println ("Wrong Input");
    }
}
    }
