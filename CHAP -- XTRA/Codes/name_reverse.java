import java.io.*;
class name_reverse
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter a name consisting of 3 words:-");
String s,q= "",c="";
int i,l;
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
    if(s.charAt(i)==" ")
    {
        break;
    }
}
c=s.substring(i+1)+" ";
q=c+s.substring(0,i);
System.out.println(name is:-"(q));
}
}
