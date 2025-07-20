import java.io.*;
class string41
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j=0;
System.out.println("Enter the string : - ");
s=br.readLine();
l=s.length();
System.out.print(s.charAt(0));
for(i=1;i<l;i++)
{
if(s.charAt(i)==' ')
{
 System.out.print("."+s.charAt(i+1));
 j=i+1;
}
}
for(i=j+1;i<l;i++)
{
 System.out.print(s.charAt(i));
    }
    }
}