import java.io.*;
class swaping_02
{ 
public static void main (String args[]) throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Enter the 2nd no.");
b=Integer.parseInt (br.readLine());
System.out.println ("The values of a and b before swaping is" + a + "and" + b);
c=a;
a=b;
b=c;
System.out.println ("The values of a and b after swaping is" + a + "and" + b);
    }
}