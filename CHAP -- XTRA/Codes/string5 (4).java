import java.io.*;
class string5
{
    public static void main(String args[])throws IOException
    {
String s;
int l,i;
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text : -   ");
s=br.readLine();
s=s.toUpperCase();
System.out.println(s);
    }
}