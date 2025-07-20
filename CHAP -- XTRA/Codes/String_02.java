import java.io.*;
class String_02
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int l;
String s;
System.out.println ("Enter the string");
s=br.readLine ();
l=s.length();
System.out.print ("The length of the string is "+l);
    }
}