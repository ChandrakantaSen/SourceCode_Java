import java.io.*;
class Stringpali11
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER YOUR STRING");
String s=br.readLine();
s=s.concat(" ");
String a,b,rev;
int i,j,p=0,c,m,n;
j=s.length();
for(i=0;i<j;i++)
{
c=0;
rev="";
if(s.charAt(i)==' ')
{
a=s.substring(p,i);
//System.out.println(a);
a=a.replace(" ","");
c=a.length();
for(m=c-1;m>=0;m--)
{
  rev=rev+a.charAt(m);
}
//rev=rev+"";
if(a.compareTo(rev)==0)
{
System.out.println(rev);
  }   
p=i+1;
    }
 
}
    }
}