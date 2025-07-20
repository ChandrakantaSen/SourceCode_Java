import java.io.*;
class string_fahad11
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
int l,i,c=0;
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
c++;
    }
}
System.out.println("The no. of words in the uper string is:-"+(c+1));
    }
}
    