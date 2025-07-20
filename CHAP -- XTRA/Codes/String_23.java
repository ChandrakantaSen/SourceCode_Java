import java.io.*;
class String_23
{
public static void main (String args[]) throws IOException
{
String s,k="",t="";
int l,i,j,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter Your String");
s=br.readLine ();
s=s+" ";
l=s.length ();
for (i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
    
   
    for(j=k.length()-1;j>=0;j--)
        {
            t=t+k.charAt(j);
        }
        System.out.print(t+" ");
        t="";
    }
    
}
}
}


            
