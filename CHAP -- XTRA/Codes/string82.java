import java.io.*;
class string82
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j=0;
System.out.println("Enter the string : - ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
 j=i+1;
}
}
for(i=j;i<l;i++)
{
k=k+s.charAt(i);
    }
k=k+" ";
for(i=0;i<j-1;i++)
{
k=k+s.charAt(i);
    }    
System.out.println(k);    
    }
}