import java.io.*;
class Prg19
{
public static void main(String args[])throws IOException
{
String s;
int i,l,c,k;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
k=(int)(s.charAt(i));
k=k+1;
System.out.print((char)(k));
    }
}
    }