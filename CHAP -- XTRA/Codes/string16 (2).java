import java.io.*;
class string16
{
public static void main(String args[])throws IOException
{
String s;
int c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any string : - ");
s=br.readLine();
c=s.indexOf('a');
System.out.println(c);
    }
}