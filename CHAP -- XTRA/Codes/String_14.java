import java.io.*;
class String_14
{
public static void main (String args[]) throws IOException
{
String s,k="",g="";
char ch;
int l,i,j;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter Your String");
s=br.readLine ();
s=s+" ";
l=s.length ();
for (i=0;i<l;i++)
{
if(s.charAt(i)!=' ')
{
k=k+s.charAt(i);
    }
    else
    {
        for (j=k.length()-1;j>=0;j--)
        {
            g=g+k.charAt(j);
        }
        if (k.compareTo(g)==0)
        {
         System.out.println (k);
        }
        System.out.print (g+" ");
        k="";
        g="";
    }
}
    }
}