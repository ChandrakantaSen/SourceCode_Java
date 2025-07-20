import java .io.*;
class String_06
{
public static void main (String args[]) throws IOException
{
String s,k=" ";
char ch;
int l,i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your String");
s=br.readLine();
l=s.length();
System.out.println("The reverse of the string are as follows : - ");
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
System.out.println(k);
    }
}
