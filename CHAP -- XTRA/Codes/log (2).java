import java.io.*;
class log
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.log (a);
System.out.println (" The log value of " +a+" is " +b);
    }
}
