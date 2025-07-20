import java.io.*;
class Stringpali1
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER YOUR STRING");
String s=br.readLine();
String a,b;
int i,j;
j=s.length();
for(i=0;i<j;i++)
{
if(s.charAt(i)==' ')
{
a=s.substring(0,i);
System.out.println(a);
s=s.substring(i,j);
System.out.println(s);
    }

    }
}
    }