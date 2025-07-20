import java.io.*;
class Short2
{
public static void main(String args[])throws IOException
{
String s;
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter your full name : - ");
s=br.readLine();
l=s.length();
System.out.print(s.charAt(0));
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
c=i+1;
System.out.print("."+s.charAt(i+1));
    }
}
for(i=c+1;i<l;i++)
{
System.out.print(s.charAt(i));
    }
}
    }