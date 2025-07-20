import java.io.*;
class same5
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
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
for(j=k.length()-1;j>=0;j--)
{
g=g+k.charAt(j);
    }
    if(k.compareTo(g)==0)
    {
 t++;
 g="";
    }
}
System.out.println("The no. of palindrome words are : -" +t);
    }
}
    }