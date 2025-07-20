import java.io.*;
class cube_root
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.cbrt (a);
System.out.println (" The cube root value of " +a+" is " +b);
    }
}
