import java.io.*;
class function_06
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
static int a,b;
public static int add (int x,int y)
{
return a+b;
}
public static void main (String args[]) throws IOException
{
System.out.println ("Please enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Please enter the 2nd no.");
b=Integer.parseInt (br.readLine ());
function_06 ob=new function_06();
System.out.println (" The sum of "+a+" and "+b+" is "+ob.add(a,b));    
     }
    }