import java.io.*;
class string_fahad6
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
int l;
l=s.length();
System.out.println("The length of the string is"+s.charAt(l-1));
    }
}