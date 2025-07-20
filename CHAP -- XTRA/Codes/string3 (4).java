import java.io.*;
class string3
{
    public static void main(String args[])throws IOException
    {
String s;
int l,i;
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text : -   ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
System.out.println(ch);
    }
    }
}