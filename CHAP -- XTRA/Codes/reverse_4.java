import java.io.*;
class reverse_4
{
public static void main(String args[])throws IOException
{
String s,q=" ";int p=0,w=0;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a string");
s=br.readLine();
s=s.concat(" ");
int l=s.length();
String a[]=new String[l/2];
for(int i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
q=s.substring(p,i);
p=i+1;
a[w]=q;
w++;}
    }
    for(int j=l/2-1;j>=0;j--)
    {
      System.out.print(a[j]+" ");
    }
      
    
}
    }
    