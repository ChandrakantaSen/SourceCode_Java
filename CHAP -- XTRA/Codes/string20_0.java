import java.io.*;
class string20_0
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,c=0;
System.out.println("Enter the text to print the reverse of it");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
if(s.compareToIgnoreCase(k)==0)
{
System.out.println(s+"is a palindrome string");
    }
    else
    {
        System.out.println(s+"is not a palindrome string");
    }
    
}
    }