import java.io.*;
class Prg26
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any String: -");
s=br.readLine();
s=s+" ";
l=s.length();
System.out.println("The each extracted words are as follows:-");
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
System.out.println(k);
    }
}
    }
}