import java.io.*;
public class calculator
{
 public static void main(String args[])throws IOException
 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int a,b,d,c;
 String x,y,z;
 int l;
 int ch;
 do
 {
System.out.print("\nWELCOME TO THE PROJECT. 1.Number Calculator.\n2.String Calculator.\n3.Help.\n4.Exit.");
System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
if(ch==4)
{
break;
    }
    else
    {
switch(ch)      
{
case 1:
 do
 {
System.out.print("\n1.Addition.\n2.Subtraction.\n3.Multipication.\n4.Division.\n5.Mod Division.\n6.Termination.");
      System.out.println("Enter your choice");
        c=Integer.parseInt(br.readLine());
         if(c==6)
        {
            break;
        }
        else
        {
        System.out.println("\nEnter a number");
        a=Integer.parseInt(br.readLine());
      System.out.println("Enter a number");
      b=Integer.parseInt(br.readLine());
switch(c)
{
case 1:
d=a+b;
System.out.println("The answer is = "+d);
break;
case 2:
d=a-b;
System.out.println("The answer is = "+d);
break;
case 3:
d=a*b;
System.out.println("The answer is = "+d);
break;
case '4':
d=a/b;
System.out.println("The answer is = "+d);
break;
case 5:
d=a%b;
System.out.println("The answer is = "+d);
break;
default:
System.out.println("Wrong Choice.");
break;
    }
}
}
    while(c>0);
    break;
    case 2:
    do
 {
System.out.print("\n1.reverse of string.\n2.palindrome of string.\n3.word search.\n4.short name.\5");
      System.out.println("Enter your choice");
        c=Integer.parseInt(br.readLine());
         if(c==6)
        {
            break;
        }
        else
        {
        System.out.println("\nEnter a number");
        a=Integer.parseInt(br.readLine());
      System.out.println("Enter a number");
      b=Integer.parseInt(br.readLine());
switch(c)
{
case 1:
d=a+b;
System.out.println("The answer is = "+d);
break;
case 2:
d=a-b;
System.out.println("The answer is = "+d);
break;
case 3:
d=a*b;
System.out.println("The answer is = "+d);
break;
case '4':
d=a/b;
System.out.println("The answer is = "+d);
break;
case 5:
d=a%b;
System.out.println("The answer is = "+d);
break;
default:
System.out.println("Wrong Choice.");
break;
    }
}
}
    while(c>0);
}
    }
      