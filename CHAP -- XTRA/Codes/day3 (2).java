import java.io.*;
import java.lang.*;
class day3
{
public static void main(String args[]) throws IOException
{
int a,b,c,d;
char choice;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number :");
b=Integer.parseInt(br.readLine());
System.out.println("Enter the second number :");
c=Integer.parseInt(br.readLine());
System.out.println("Enter your choice :(+,/,-,*)");
choice=(char)br.read();

switch(choice)
{
 case '+' :
 System.out.println("Addition result is" +(a=b+c));
 break;

 case '-':
 if(b<c)
 {
 d=b;
 b=c;
 c=d;
 System.out.println("Subtraction result is" +(a=b-c));
 }
 System.out.println("Subtraction result is" +(a=b-c));
 break;

 case '*':
 System.out.println("Multiplication result is" +(a=b*c));
 break;

  case '/':
 System.out.println("Division result is" +(a=b/c));
 break;

 default:
 System.out.println("No choice");
 break;
}
}
} 
