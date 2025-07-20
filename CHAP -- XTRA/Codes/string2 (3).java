import java.io.*;
class string2
{
public static void main(String args[])throws IOException
{
String s;
char ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
ch=s.charAt(0);
System.out.println("The first character of the string is : - "+ch);

    }
}