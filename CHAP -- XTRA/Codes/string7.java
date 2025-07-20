import java.io.*;
class string7
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
char ch;
System.out.println("Enter the text");
s=br.readLine();
ch=s.charAt(0);
System.out.println("The first character of the upper string is:"+ch);
    }
}