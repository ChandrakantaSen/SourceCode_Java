import java.io.*;
class word_pallin
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
String S1="";int i;int l;
System.out.println("enter a word:-");
String S=br.readLine();
 l= S.length();
for(i=l-1;i>=0;i--)
{
S1=S1+S.charAt(i);
}
if(S.equals(S1)==true)
{
    System.out.println(S1+"is a palindrome");
}
else
{
    System.out.println(S1+"is a palindrome");
}
}
}

