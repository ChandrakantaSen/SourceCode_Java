
import java.io.*;
class Frequency
{
public static void main(String args[])throws IOException
{
String s;
int i,l,j,flag=0,fr=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any sentence:-");
s=br.readLine();
l=s.length();
System.out.println("Characters \t Frequency");
for(i=0;i<l;i++)
{
for(j=0;j<l;j++)
if(s.charAt(i)==s.charAt(j))
fr=fr+1;
for(j=i-1;j>=0;j--)
if(s.charAt(i)==s.charAt(j))
flag=1;
if(flag!=1)
System.out.println(s.charAt(i)+"\t\t"+fr);
fr=0;
flag=0;
    }
}
    }