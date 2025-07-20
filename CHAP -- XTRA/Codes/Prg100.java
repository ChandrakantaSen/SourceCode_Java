import java.io.*;
class Prg100
{
public static void main(String args[])throws IOException
{
String s;
int a,b,l,d=0,i;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter your choice 1");
s=br.readLine();
l=s.length();
s=" "+s;
switch(d)
{
case 1:
System.out.println("Enter a string:"); 
System.out.print(s.charAt(0));
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.print(s.charAt(i+1));
    }
}
break;
case 2:
System.out.println("Enter your choice 1");
System.out.println("Enter a string:");
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.print(s.charAt(i-1));
    }
}
    }
}
    }