import java.io.*;
class ceil
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.ceil (a);
System.out.println (" The ceil value of " +a+" is " +b);
    }
}
