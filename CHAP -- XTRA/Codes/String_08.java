import java .io.*;
class String_08
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
if (s.equals(k)==true)
{
System.out.println ("Yes");
    }
    else
    {
        System.out.println ("No");
    }
}
    }
