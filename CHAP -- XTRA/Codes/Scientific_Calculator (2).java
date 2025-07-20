import java.io.*;
public class Scientific_Calculator
{
public static void main(String args [])throws IOException
{
int ch,a,b;
double s=0.0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("............MENU............");
System.out.println("Enter 1. to add two numbers");
System.out.println("Enter 2. to substract two numbers");
System.out.println("Enter 3. to multiply two numbers");
System.out.println("Enter 4. to divide two numbers");
System.out.println("Enter 5. to find the square root of a number");
System.out.println("Enter 6. to find the cube root of a number");
System.out.println("Enter 7. to find the sin value of a number");
System.out.println("Enter 8. to find the cos value of a number");
System.out.println("Enter 9. to find the tan value of a number");
System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1:
System.out.println("Enter the two numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
s=a+b;
System.out.println("The sum of two numbers "+a+" and "+b+" is"+(int )(s));
break;
case 2:
System.out.println("Enter the two numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
s=a-b;
System.out.println("The difference between two numbers "+a+" and "+b+" is"+(int)(s));
break;
case 3:
System.out.println("Enter the two numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
s=a*b;
System.out.println("The product of two numbers "+a+" and "+b+" is"+(int)(s));
break;
case 4:
System.out.println("Enter the two numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
s=a/b;
System.out.println("The result +of "+a+" and "+b+" is"+(int)(s));
break;
case 5:
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
s=Math.sqrt(a);
System.out.println("The result is"+(int)(s));
break;
case 6:
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
s=Math.cbrt(a);
System.out.println("The result is"+(int)(s));
break;
case 7:
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
s=Math.sin(a);
System.out.println("The result is"+(int)(s));
break;
case 8:
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
s=Math.cos(a);
System.out.println("The result is"+(int)(s));
break;
case 9:
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
s=Math.tan(a);
System.out.println("The result is"+(int)(s));
break;
default:
System.out.println("Wrong choice");
}
}
}