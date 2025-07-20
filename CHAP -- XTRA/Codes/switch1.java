import java.io.*;
class switch1
{
public static void main(String args[])throws IOException
{
int a,b,c,d;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the first no.: -");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second no.: -");
b=Integer.parseInt(br.readLine());
System.out.println("Enter your choice.: -");
d=Integer.parseInt(br.readLine());
switch(d)
{
case 1:
c=a+b;
System.out.println("The addition of "+a+" and "+b+" is : - "+c);
break;
case 2:
c=a-b;
System.out.println("The subtraction of "+a+" and "+b+" is : - "+c);
break;
case 3:
c=a*b;
System.out.println("The multiplication of "+a+" and "+b+" is : - "+c);
break;
case 4:
c=a/b;
System.out.println("The division of "+a+" and "+b+" is : - "+c);
break;
case 5:
c=a%b;
System.out.println("The remainder of "+a+" and "+b+" is : - "+c);
break;
default:
System.out.println("Invalid choice");
    }
}
    }
