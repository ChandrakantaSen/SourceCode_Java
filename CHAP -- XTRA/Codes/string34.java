import java.io.*;
class string34
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="",g="";
int i,l,c=0,c1=0,t=0,j;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
for(j=0;j<(k.length());j++)
{
if((k.charAt(j)=='A')||(k.charAt(j)=='a')||(k.charAt(j)=='E')||(k.charAt(j)=='e')||(k.charAt(j)=='I')||(k.charAt(j)=='i')||(k.charAt(j)=='O')||(k.charAt(j)=='o')||(k.charAt(j)=='U')||(k.charAt(j)=='u'))
{
c1++;
    }
}
if(c1>t)
{
t=c1;
g=k;
    }
}
    }

System.out.println("The word with maximum number of vowels is:"+g);
    }
}
