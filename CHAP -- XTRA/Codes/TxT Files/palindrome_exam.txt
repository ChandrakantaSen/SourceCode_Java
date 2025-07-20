import java.io.*;
class palindrome_exam
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter string");
String s=br.readLine();
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
 rev=rev+s.charAt(i);
}
if(rev.compareTo(s)==0)
 System.out.println("is palindrome");

    else
    System.out.println("is not a palindrome");
}
    }
    

    