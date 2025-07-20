import java.io.*;
class string_fahad4
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
char ch;
System.out.println("Enter your string");
s=br.readLine();
ch=s.charAt(4);
System.out.println("The string character of the upper string is"+ch);
    }
}