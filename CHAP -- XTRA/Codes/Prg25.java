import java.io.*;
class Prg25
{
public static void main(String args[])throws IOException
{
String s,t="",k="";
int i,l,c=0,j=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any sentence:-");
s=br.readLine();
l=s.length();
System.out.println("Enter the word to be searched:-");
t=br.readLine();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
if(k.compareTo(t)==0)
{
j++;
    }
    k=" ";
System.out.println("search word occurs:-"+c);
    }
}
    }
}
