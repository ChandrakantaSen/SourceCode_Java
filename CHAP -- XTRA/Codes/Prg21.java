import java.io.*;
class Prg21
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
{
if(k>90)
{
k=k-26;
    }
System.out.print((char)(k));
    }
}
}
    }
