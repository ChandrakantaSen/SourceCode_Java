import java.io.*;
class String_04
{
public static void main (String args[]) throws IOException
{
String s;
char ch;
int l;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter Your String");
s=br.readLine ();
l=s.length ();
ch=s.charAt (l-1);
System.out.println ("The last character of the upper string is : - "+ch);
    }
}






































