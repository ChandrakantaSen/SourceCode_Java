import java.io.*;
class string28
{
public static void main(String args[])throws IOException
{
String s,k,g,t,p="",h="",x="";
int i,l,c=0,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
System.out.println("Enter the word to be replaced : - ");
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
    if(k.compareTo(t)==0)
    {
p=s.substring(0,c);
h=s.substring(i,(l-1));
    }	
    c=i+1;
    }
}
x=p+g+h;
System.out.println(x);
    }
}