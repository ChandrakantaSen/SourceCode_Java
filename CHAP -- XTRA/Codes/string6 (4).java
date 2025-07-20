import java.io.*;
class string6
{
    public static void main(String args[])throws IOException
    {
String s;
int l,i;
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text in uppercase : -   ");
s=br.readLine();
s=s.toLowerCase();
System.out.println(s);
    }
}