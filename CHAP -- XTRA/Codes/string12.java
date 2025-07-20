import java.io.*;
class string12
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l,c=0;
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
c++;
    }
}
System.out.println("The number of space bar :"+c);
    }
}