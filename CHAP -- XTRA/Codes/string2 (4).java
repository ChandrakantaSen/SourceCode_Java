import java.io.*;
class string2
{
    public static void main(String args[])throws IOException
    {
String s;
int l;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text : -   ");
s=br.readLine();
l=s.length();
System.out.println("The length of the string is = "+l);
    }
}