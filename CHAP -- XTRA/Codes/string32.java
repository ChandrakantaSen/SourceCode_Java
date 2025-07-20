import java.io.*;
class string32
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l;
System.out.println("Enter the string");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if((s.charAt(i)=='A')||(s.charAt(i)=='a')||(s.charAt(i)=='E')||(s.charAt(i)=='e')||(s.charAt(i)=='I')||(s.charAt(i)=='i')||(s.charAt(i)=='O')||(s.charAt(i)=='o')||(s.charAt(i)=='U')||(s.charAt(i)=='u'))
{
k=k+"*";
    }
    else
    {
        k=k+s.charAt(i);
    }
}
System.out.println(k);
    }
    
}