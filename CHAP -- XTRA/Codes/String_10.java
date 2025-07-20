import java .io.*;
class String_10
{
public static void main (String args[]) throws IOException
{
String s;
BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your string");
s=br.readLine();
int p=s.indexOf('o');
System.out.println (p);
    }
}