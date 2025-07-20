import java.io.*;
class piglatin
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="",g="",t="";
int i,l,c=0;
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if((s.charAt(i)=='A')||(s.charAt(i)=='a')||(s.charAt(i)=='E')||(s.charAt(i)=='e')||(s.charAt(i)=='I')||(s.charAt(i)=='i')||(s.charAt(i)=='O')||(s.charAt(i)=='o')||(s.charAt(i)=='U')||(s.charAt(i)=='u'))
{
k=s.substring(i,l);
break;
    }
}
g=s.substring(0,i);
t=k+g+"ay";
System.out.println(t);
    }
}