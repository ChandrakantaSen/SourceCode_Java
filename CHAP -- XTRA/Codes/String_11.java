import java .io.*;
class String_11
{
public static void main (String args[]) throws IOException
{
String s;
char ch;
BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your string");
s=br.readLine();
System.out.println ("Enter your Character");
ch=(char) (br.read());
int p=s.indexOf(ch);
System.out.println (p);
    }
}