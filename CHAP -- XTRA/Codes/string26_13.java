import java.io.*;
class string26_13
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="",t="";
int i,l,c=0,j;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
System.out.println("Each extracted palindrome words from the sentence are as follows : - ");
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
for(j=k.length()-1;j>=0;j--)
{
t=t+k.charAt(j);
}
if(k.equals(t)==true)
{
System.out.println(k);
}
t="";
    }
}
    }
}