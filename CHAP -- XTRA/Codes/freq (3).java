import java.io.*;
class freq
{                                                     
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("enter a sentence");
s=br.readLine();
int l,i,j,flag=0,fr=0;
l=s.length();
System.out.println("Characters\t\tFrequency");
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