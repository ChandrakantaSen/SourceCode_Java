import java.io.*;
class Bibliography
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0,t=0,g=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any String: -");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
t++;
k=s.substring(c,i);
c=i+1;
    }
}
System.out.print(k+"."+s.charAt(0));
for(i=1;i<l;i++)
{
if(s.charAt(i)==' ')
{
g++;
if(g<=t-2)
{
System.out.print("."+s.charAt(i+1));
    }
}
}
}
    }