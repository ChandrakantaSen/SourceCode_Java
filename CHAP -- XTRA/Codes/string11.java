import java.io.*;
class string11
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l;
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
System.out.println("The each character of the upper string are as follows:");
for(i=0;i<l;i++)
{
System.out.println(s.charAt(i));
    }
}
    }