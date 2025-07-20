import java.io.*;
class string8
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int l;
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
System.out.println("The length of the upper string is:"+l);
    }
}