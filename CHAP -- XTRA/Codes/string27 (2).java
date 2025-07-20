import java.io.*;
class string27
{
public static void main(String args[])throws IOException
{
String s,k,g,t;
int i,l,c=0,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
System.out.println("Enter the word to be reaplaced : - ");
t=br.readLine();
System.out.println("Enter the word to be add : - ");
g=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
    if(k.compareTo(t)==0)
    {
s=s.replace(t,g);
    }
    }
}
System.out.println(s);
    }
}