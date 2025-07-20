import java.io.*;
class string11
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
if(s.compareTo(k)==0)
{
System.out.println(s+" is a palindrome string .");
    }
    else
    {
System.out.println(s+" is not a palindrome string .");        
    }
    }
}