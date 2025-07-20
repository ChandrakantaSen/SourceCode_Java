import java .io.*;
class func1
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
static int a,b,c;
public static void show()
{
System.out.println("The addition values of "+a+" and "+b+" is : - "+c);
    }
public static void display()
{
System.out.println("The entered two numbers are "+a+" and "+b);
    }
public static void add()
{
c=a+b;
    }     
public static void main(String ags[])throws IOException
{
input();
display();
add();
show();
    }    
public static void input()throws IOException
{
System.out.println ("Enter the first number : - ");
a=Integer.parseInt(br.readLine());
System.out.println ("Enter the second number : - ");
b=Integer.parseInt(br.readLine());
    }
}
