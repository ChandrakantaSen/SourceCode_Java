import java.io.*;
class cos
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.cos (a);
System.out.println (" The cos value of " +a+" is " +b);
    }
}
