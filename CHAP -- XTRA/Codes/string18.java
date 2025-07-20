import java.io.*;
class string18
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l,c=0;
System.out.println("Enter the text to print the reverse of it");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
System.out.print(s.charAt(i));
    }
}
    }