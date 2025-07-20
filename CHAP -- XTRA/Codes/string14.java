import java.io.*;
class string14
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("Enter the text in lower case");
s=br.readLine();
s=s.toUpperCase();
System.out.println("The text in upper case is:"+s);
    }
}