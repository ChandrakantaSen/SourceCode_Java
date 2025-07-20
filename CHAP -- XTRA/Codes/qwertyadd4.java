import java.io.*;
class qwertyadd4
{
public static void main (String args[]) throws IOException
{
float a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter the 1st no.");
a=Float.parseFloat(br.readLine());
System.out.println("Enter the 2nd no.");
b=Float.parseFloat(br.readLine());
c=a-b;
System.out.println (" The subtraction of " +a+ " and " +b+ " is "+c);
    }
}
