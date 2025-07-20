import java.io.*;
class rint
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.rint (a);
System.out.println (" The rint value of " +a+" is " +b);
    }
}
