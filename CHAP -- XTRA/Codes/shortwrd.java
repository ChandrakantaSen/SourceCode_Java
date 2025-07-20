import java.io.*;
class shortwrd
{
public static void main(String args[])throws IOException
{
String s,k="",g="";
int i,l,c=0,t=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text:- ");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
t=c;
c=i+1;
    }
}
System.out.print(k+" ");
System.out.print(s.charAt(0)+".");
for(i=1;i<t-1;i++)
{
if(s.charAt(i)==' ')
{
System.out.print(s.charAt(i+1)+".");
    }
}
    }
}