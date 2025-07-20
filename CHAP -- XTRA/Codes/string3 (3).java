import java.io.*;
class string3
{
public static void main(String args[])throws IOException
{
String s;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
System.out.println("The first character of the string is : - "+s.charAt(0));

    }
}