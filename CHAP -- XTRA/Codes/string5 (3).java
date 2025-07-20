import java.io.*;
class string5
{
public static void main(String args[])throws IOException
{
String s;
int i,l;
char ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
System.out.println("The last character of the string is : - "+s.charAt(l-1));

    }
}