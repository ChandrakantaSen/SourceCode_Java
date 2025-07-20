import java.io.*;
class string26_2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
System.out.println("Each extracted word and the length of each extracted words from the sentence are as follows");
for(i=0;i<l;i++)
{
if(s.charAt(i)!=' ')
{
k=k+s.charAt(i);
}
else
{
System.out.println(k+"  "+k.length());
k="";
    }
}
    }
 }