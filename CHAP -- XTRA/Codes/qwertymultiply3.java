import java.io.*;
class qwertymultiply3
{
public static void main (String args[]) throws IOException
{
long a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter the 1st no.");
a=Long.parseLong(br.readLine());
System.out.println("Enter the 2nd no.");
b=Long.parseLong(br.readLine());
c=a*b;
System.out.println (" The multiplication of " +a+ " and " +b+ " is "+c);
    }
}
