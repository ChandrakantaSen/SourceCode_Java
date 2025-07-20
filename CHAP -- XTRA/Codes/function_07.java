import java.io.*;
class function_07
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
static int a,b,c;
public static void add (int x,int y)
{
c=x+y;
}
public static void show ()
{
System.out.println ("The addition value is:-"+c);
    }
public static void main (String args[]) throws IOException
{
function_07 ob=new function_07();
ob.add(5,4);
ob.show();
    }
}