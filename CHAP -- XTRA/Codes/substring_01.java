import java .io.*;
class substring_01
{
public static void main (String args[]) throws IOException
{
String s,k="";
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your String");
s=br.readLine();
k=s.substring (2,5);
System.out.println (k);
    }
}