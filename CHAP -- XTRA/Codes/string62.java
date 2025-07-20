import java.io.*;
class string62
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="",t="";
int i,l,c=0,p;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
p=l;
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
if(k.length()<p)
{
p=k.length();
t=k;
}
    }
}
System.out.println("The shortest word in the upper string is : - "+t+" and the length of the shortest word is : - "+p);
    }
}