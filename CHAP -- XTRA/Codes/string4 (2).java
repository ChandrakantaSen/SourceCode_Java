import java.io.*;
class string4
{
    public static void main(String args[])throws IOException
    {
String s;
int l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text : -   ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
System.out.println(s.charAt(i));
    }
    }
}