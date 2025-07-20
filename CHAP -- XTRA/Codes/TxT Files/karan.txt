import java.io.*;
class karan
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the String");
String s=br.readLine();
System.out.print(s.substring(s.lastIndexOf(" ")+1,s.length())+" ");
System.out.print(s.substring(0,s.lastIndexOf(" ")));
    }
}
