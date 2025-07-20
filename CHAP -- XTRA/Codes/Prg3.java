import java.io.*;
class Prg3
{
public static void main(String args[])throws IOException
{
String s;
int i,l;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
s=br.readLine();
l=s.length();
System.out.print(s.charAt(0));
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.print("."+s.charAt(i+1));
    }
}
    }
}
