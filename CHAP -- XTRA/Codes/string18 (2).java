import java.io.*;
class string18
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
k=s.substring(2,5);
System.out.println(k);
    }
}