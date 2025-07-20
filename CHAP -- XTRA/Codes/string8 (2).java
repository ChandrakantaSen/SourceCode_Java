import java.io.*;
class string8
{
public static void main(String args[])throws IOException
{
String s;
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
c++;
    }
    }
    c=c+1;
System.out.println("The number of words are : - "+c);
    }
}