import java.io.*;
class Prg30
{
public static void main(String args[])throws IOException
{
String s;
int ch,b,l,i;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any string:");
s=br.readLine();
l=s.length();
System.out.println("Enter your choice 1 or 2");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println(s.charAt(0));
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.println(s.charAt(i+1));
    }
}
break;
case 2:
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.println(s.charAt(i-1));
    }
}

break;
default:
System.out.println("Invalid Choice");
}
    }
}










