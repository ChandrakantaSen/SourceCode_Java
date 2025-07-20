import java.io.*;
class Prg23
{
public static void main(String args[])throws IOException
{
String s;
int k,l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text");
s=br.readLine();
System.out.println("Character \t Ascii value");
for(i=0;i<s.length();i++)
{
k=(int)(s.charAt(i));
System.out.println(s.charAt(i)+" \t "+k);
    }
}
    }