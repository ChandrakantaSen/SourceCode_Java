import java.io.*;
import java.lang.*;
class smallest1
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter string:");
String n=input.readLine();
String g=" ";
int i,b=0,p=0,l,l1;
l=n.length();
int mn=l;
char h;
for(i=0;i<l;i++)
{
h=n.charAt(i);
if(h==' ')
{
b=i;
String s;
s=n.substring(p,b);
l1=s.length();
b=i+l;
if(l1<mn)
{
mn=l1;
g=s;
    }
}}
System.out.println("Smallest word:"+g);
    
    }
}
