import java.io.*;
class string_fahad8
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
int l,i;
l=s.length();
System.out.println("The each character of the string are a follows:-");
for(i=0;i<l;i++)
{
System.out.println(s.charAt(i));
    }
}
    }