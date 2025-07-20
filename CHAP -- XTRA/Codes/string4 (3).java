import java.io.*;
class string4
{
public static void main(String args[])throws IOException
{
String s;
int l;
char ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
ch=s.charAt(l-1);
System.out.println("The last character of the string is : - "+ch);

    }
}