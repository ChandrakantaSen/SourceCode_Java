import java.io.*;
class same2
{
public static void main(String args[])throws IOException
{
String s,k="",g="";
int i,l,c=0,j,t=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<1;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=l+1;
for(j=k.length()-1;j>=0;j--)
{
g=g+k.charAt(j);
    }
    if(k.compareTo(g)==0)
    {
t++;
    }
g="";
    }
}
System.out.println("The number of palindrome words from the upper string are : - "+t);
    }
}