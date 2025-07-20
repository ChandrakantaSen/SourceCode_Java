import java.io.*;
class String_12
{
public static void main (String args[]) throws IOException
{
String s,k="";
char ch;
int l,i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter Your String");
s=br.readLine ();
s=s+"";
l=s.length ();
for (i=0;i<l;i++)
{
if(s.charAt(i)!=' ')
{
k=k+s.charAt(i);
    }
    else
    {
     System.out.println (k);
     k=" ";
    }
}
    }
}