import java.io.*;
class square_root
{
public static void main (String arrgs[]) throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
b=Math.sqrt (a);
System.out.println (" The square root value of " +a+" is " +b);
    }
}
