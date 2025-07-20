import java.io.*;
class string_fahad9
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
int l,i;
char ch;
l=s.length();
System.out.println("The each character of the string are a follows:-");
for(i=0;i<l;i++)
{
ch=s.charAt(i);
System.out.println(ch);
    }
}
    }