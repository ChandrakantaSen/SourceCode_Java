import java.io.*;
class String_22
{
public static void main (String args[]) throws IOException
{
String s,k="",t="";
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
    for(j=k.length()-1;j>=0;j--)
        {
            t=t+k.charAt(j);
        }
        System.out.print(t+" ");
        t="";
        k="";
    }
}
}
}


            
