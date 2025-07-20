import java.io.*;
class swaping_03
{
public static void main (String args[]) throws IOException
{
int a,b,c;
a=10;
b=5;
System.out.println ("The values of a and b before swaping is" + a + "and" + b);
a=a+b;
b=a-b;
a=a-b;
System.out.println ("The values of a and b after swaping is" + a + "and" + b);
    }
}