import java.io.*;
class Swapanda3
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
}
class Swapanda4
{
   public static void main(String args[])throws IOException
    {
        Swapanda3 ob=new Swapanda3();
        Swapanda3 ob1=new Swapanda3();
        ob.input();
      ob.display();
      ob.add();
      ob.show();
      ob1.input();
      ob1.display();
      ob1.add();
      ob1.show();
      System.out.println("How are you");
    }
    }