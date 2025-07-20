import java .io.*;
class substring_03
{
public static void main (String args[]) throws IOException
{
String s,k=" ";
int i,l,c=0;
char ch;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your String");
s=br.readLine();
s=s+" ";
l=s.length();
for (i=0;i<l;i++)
{
if (s.charAt(i)==' ')
{
k=s.substring (c,i);
System.out.println (k);
c=i+1;
    }
}
    }
}