import java.io.*;
class shortest_word
{
public static void main(String args[])throws IOException
{
String s,k="",g="";
int i,l,j=0,t=0,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any sentence:-");
s=br.readLine();
s=s+" ";
l=s.length();
j=l;
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
t=k.length();
if(t<j)
{
j=t;
g=k;
    }
c=i+1;
    }
    }
System.out.println("The shortest word is : - "+g);
}
    }