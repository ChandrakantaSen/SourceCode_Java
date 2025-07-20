import java.io.*;
class function_05
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
static int a,b;
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
public static int add ()
{
int c=a+b;
return c;
}
public static void main (String args[]) throws IOException
{
int k;
function_05 ob=new function_05();
ob.input ();
ob.display ();
k=ob.add ();
System.out.println (" The sum of "+a+" and "+b+" is "+k);    
     }
    }