import java.io.*;
class function_04
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
static int a,b,c;
public static void add (int x,int y)
{
c=x+y;
    }
public static void show ()
{
System.out.println (" The sum of "+a+" and "+b+" is "+c);    
     }
public static void main (String args[]) throws IOException
{
System.out.println ("Please enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Please enter the 2nd no.");
b=Integer.parseInt (br.readLine());
function_04 ob=new function_04();
ob.add (a,b);
ob.show ();
    }
}