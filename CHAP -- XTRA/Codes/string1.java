import java.io.*;
class string1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("Enter the text");
s=br.readLine();
System.out.println("The first character of the upper string is:"+s.charAt(0));
    }
}