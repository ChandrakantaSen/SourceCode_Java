import java.io.*;
class string10
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
System.out.println("The reverse of the string is  : - "+k);
    }
}