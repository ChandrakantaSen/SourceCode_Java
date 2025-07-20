import java.io.*;
class Swapanda2
{
public static int a,b,c;
public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the first number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number : - ");
b=Integer.parseInt(br.readLine());
    }
 public static void display()
{
System.out.println("The inputted two number are "+a+" and "+b);
    }
public static void add()
{
c=a+b;
    }
    public static void show()
{
System.out.println("The addition value of "+a+" and "+b+" is : -   "+c);
    }
   public static void main(String args[])throws IOException
    {
        input();
      display();
      add();
      show();
    }
    }