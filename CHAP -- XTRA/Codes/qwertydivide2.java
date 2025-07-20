import java.io.*;
class qwertydivide2
{
public static void main (String args[]) throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter the 1st no.");
a=Double.parseDouble(br.readLine());
System.out.println("Enter the 2nd no.");
b=Double.parseDouble(br.readLine());
c=a/b;
System.out.println (" The division of " +a+ " and " +b+ " is "+c);
    }
}
