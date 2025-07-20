import java.io.*;
class Prg37
{
public static void main(String args[])throws IOException
{
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any String: - ");
s=br.readLine();
s=" "+s;
l=s.length();
System.out.print("The palindrome words are as follows:-");
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
if(s.compareTo(k)==0)
{
System.out.print(s);
    }
}
    }
