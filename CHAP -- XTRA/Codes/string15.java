import java.io.*;
class string15
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("Enter the text in upper case");
s=br.readLine();
s=s.toLowerCase();
System.out.println("The text in lower case is:"+s);
    }
}