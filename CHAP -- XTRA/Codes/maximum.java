import java.io.*;
class maximum
{
public static void main (String arrgs[]) throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the value");
a=Double.parseDouble (br.readLine());
System.out.println ("Enter the value");
b=Double.parseDouble (br.readLine());
c=Math.max (a,b);
System.out.println (" The maximum value of " +a+ " between " +b+ " is " +c);
    }
}
