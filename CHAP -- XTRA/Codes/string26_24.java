import java.io.*;
class string26_24
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="",t="";
int i,l,c=0,j,d=0;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)!=' ')
{
k=k+s.charAt(i);
}
else
{
for(j=k.length()-1;j>=0;j--)
{
t=t+k.charAt(j);
}
if(k.compareToIgnoreCase(t)==0)
{
d++;
}
t="";
k="";
    }
}
System.out.println("The number of palindrome words in the sentence are : - "+d);
    }
}