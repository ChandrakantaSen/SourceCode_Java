import java.io.*;
class switch_case 
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,d,ch;
do
{
System.out.println("..........Menu.........");
System.out.println("Press 1 for addition");
System.out.println("Press 2 for subtraction");
System.out.println("Press 3 for multiplication");
System.out.println("Press 4 for division");
System.out.println("Press 5 for remainder");
System.out.println("Press 6 for Exit");
System.out.println(".......................");
System.out.println("Enter the choice ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Enter the first no.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second no.");
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println("The addition of"+a+"&"+b+"is:-"+c);
break;
case 2:
System.out.println("Enter the first no.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second no.");
b=Integer.parseInt(br.readLine());
c=a-b;
System.out.println("The subtraction of"+a+"&"+b+"is:-"+c);
break;
case 3:
System.out.println("Enter the first no.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second no.");
b=Integer.parseInt(br.readLine());
c=a*b;
System.out.println("The multiplication of"+a+"&"+b+"is:-"+c);
break;
case 4:
System.out.println("Enter the first no.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second no.");
b=Integer.parseInt(br.readLine());
if(b==0)
{
System.out.println("Idiot u cannot divide by zero");
continue;
    }

c=a/b;
System.out.println("The division of"+a+"&"+b+"is:-"+c);
    break;
case 5:
System.out.println("Enter the first no.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second no.");
b=Integer.parseInt(br.readLine());
if(b==0)
{
System.out.println("Idiot u cannot divide by zero");
     continue;
    }
c=a%b;
System.out.println("The remainder of"+a+"&"+b+"is:-"+c);
break;
    case 6:
System.out.println("Bye...Bye");
System.exit(0);
default:
System.out.println("Wrong Choice");
    }
}
while(true);
    }
}
