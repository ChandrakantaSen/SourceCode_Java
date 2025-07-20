import java .io.*;
class String_07
{
public static void main (String args[]) throws IOException
{
String s,k="";
char ch;
int l,i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your String");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
if (s.compareTo(k)==0)
{
System.out.println (s+"is a palindrome String ");
    }
    else
    {
        System.out.println ("Not found");
    }
}
    }
