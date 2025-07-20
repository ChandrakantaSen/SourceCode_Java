import java.io.*;
class string24
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
s=s+" ";
l=s.length();
System.out.println("The each extracted word \t The length of the word : - ");
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
System.out.println(k+"\t\t\t\t\t"+k.length());
    }
}
    }
}