import java.io.*;
class string_fahad7
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
int l;
char ch;
l=s.length();
ch=s.charAt(l-1);
System.out.println("The length of the string is"+ch);
    }
}