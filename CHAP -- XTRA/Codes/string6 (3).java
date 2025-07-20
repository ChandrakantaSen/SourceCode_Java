import java.io.*;
class string6
{
public static void main(String args[])throws IOException
{
String s;
int i,l;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
System.out.println("The each character of the string are as follows : - ");
for(i=0;i<l;i++)
{
System.out.println(s.charAt(i));
    }

    }
}