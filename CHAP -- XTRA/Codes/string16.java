import java.io.*;
class string16
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l,c=0;
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if((s.charAt(i)=='A')||(s.charAt(i)=='a')||(s.charAt(i)=='E')||(s.charAt(i)=='e')||(s.charAt(i)=='I')||(s.charAt(i)=='i')||(s.charAt(i)=='O')||(s.charAt(i)=='o')||(s.charAt(i)=='U')||(s.charAt(i)=='u'))
{
c++;
    }
}
System.out.println("The number of vowels in the string is"+c);
    }
}