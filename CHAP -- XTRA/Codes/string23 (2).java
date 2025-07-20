import java.io.*;
class string23
{
public static void main(String args[])throws IOException
{
String s,k="",g="";
int i,l,c=0,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
c=i+1;
for(j=k.length()-1;j>=0;j--)
{
g=g+k.charAt(j);
    }
System.out.print(g+" ");    
g="";
    }
}
    }
}