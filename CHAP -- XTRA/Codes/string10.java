import java.io.*;
class string10
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int l;
char ch;
System.out.println("Enter the text");
s=br.readLine();
l=s.length(); 
ch=s.charAt(l-1);
System.out.println("The last character of the upper string is:"+ch);
    }
}