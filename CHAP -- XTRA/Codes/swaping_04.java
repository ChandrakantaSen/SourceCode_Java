import java.io.*;
class swaping_04
{ 
public static void main (String args[]) throws IOException
{
int a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Enter the 2nd no.");
b=Integer.parseInt (br.readLine());
System.out.println ("The values of a and b before swaping is" + a + "and" + b);
a=a+b;
b=a-b;
a=a-b;
System.out.println ("The values of a and b after swaping is" + a + "and" + b);
    }
}