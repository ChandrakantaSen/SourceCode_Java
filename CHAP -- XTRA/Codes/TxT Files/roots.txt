import java.io.*;
 class roots
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader qads =new BufferedReader (new InputStreamReader(System.in));
System.out.println("switch in thy value");
a=Double.parseDouble(qads.readLine());
b=Math.sqrt(a);
System.out.println("sqrt is="+b);
System.out.println("cbrt is="+Math.cbrt(a));
System.out.println("fthrt is="+Math.sqrt(b));
    }
}