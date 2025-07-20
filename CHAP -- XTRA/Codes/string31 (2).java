import java.io.*;
class string31
{
public static void main(String args[])throws IOException
{
String s;
int i,l,j,k;
char ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
for(i=65;i<=122;i++)
{
for(j=0;j<l;j++)
{
k=(int)(s.charAt(j));
if(i==k)
{
System.out.print((char)(k));
    }
    }
    }
}
    }