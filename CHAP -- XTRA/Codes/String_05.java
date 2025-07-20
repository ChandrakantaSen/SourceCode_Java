import java.io.*;
class String_05
{
public static void main (String args[]) throws IOException
{
String s;
char ch;
int l,i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter Your String");
s=br.readLine ();
l=s.length ();
System.out.println("The each character of the string are as follows : - ");
for(i=0;i<l;i++)
{
System.out.println(s.charAt(i));
    }

    }
}
