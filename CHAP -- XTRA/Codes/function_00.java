import java.io.*;
class function_00
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
static int a,b,c;
public static void input ()throws IOException
{
System.out.println ("Please enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Please enter the 2nd no.");
b=Integer.parseInt (br.readLine ());
    }
public static void display ()
{
System.out.println ("The two entered no. are as follows"+a+"and"+b);
    }
public static void add ()
{
c=a+b;
}
public static void show ()
{
System.out.println ("The sum of the "+a+" and "+b+" is "+c);
    }
}