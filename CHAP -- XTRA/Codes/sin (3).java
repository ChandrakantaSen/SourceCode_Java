import java.io.*;
class sin
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.sin (a);
System.out.println (" The sin value of " +a+" is " +b);
    }
}
