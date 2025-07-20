import java.io.*;
class qwertydivide1
{
public static void main (String args[]) throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter the 1st no.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the 2nd no.");
b=Integer.parseInt(br.readLine());
c=a/b;
System.out.println ("The division of"+a+"and"+b+"is"+c);
    }
}
